/*
 * Copyright (C) 2008-2009 Yohan Liyanage. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package org.he.common.jcaptcha4struts2;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.google.code.jcaptcha4struts2.core.actions.JCaptchaImageAction;
import com.google.code.jcaptcha4struts2.core.beans.JC4S2Config;
import com.octo.captcha.service.image.ImageCaptchaService;

/**
 * This Struts2 Action generates the Captcha Image.
 * <p>
 * It utilizes the JCaptcha's Image Service to generate JPEG Stream for Captcha Image.
 * 
 * @author Yohan Liyanage
 * @since 1.0
 * @version 2.0
 */
public class MyJCaptchaImageAction extends JCaptchaImageAction {

    private static final String IMAGE_FORMAT = "jpg";
    private static final long serialVersionUID = 563498642053643243L;
    private static final Log LOG = LogFactory.getLog(MyJCaptchaImageAction.class);

    private ImageCaptchaService imageCaptchaService;
    
    /**
     * Holds the byte[] for JPEG encoded Captcha Image.
     */
    private byte[] captchaImage;

    /**
     * Action execution logic, which generates the Captcha Image Stream and sets the JPEG encoded
     * byte stream to captchaImage field.
     * <p>
     * Subsequent to invocation of this method, the generated captcha is available through
     * {@link #getCaptchaImage()} method.
     * 
     * @return action forward string
     * 
     * @throws Exception
     */
    public String execute() {

        ByteArrayOutputStream imageOut = new ByteArrayOutputStream();
        HttpServletRequest request = ServletActionContext.getRequest();

        // Captcha Id is the session ID
        String captchaId = request.getSession().getId();

        if (LOG.isDebugEnabled()) {
            LOG.debug("Generating Captcha Image for SessionID : " + captchaId);
        }

        // Generate Captcha Image
        BufferedImage image =
                getImageCaptchaService().getImageChallengeForID(captchaId, request.getLocale());

        // Encode to JPEG Stream
        try {
            ImageIO.write(image, IMAGE_FORMAT, imageOut);
        } catch (IOException e) {
            LOG.error("Unable to JPEG encode the Captcha Image due to IOException", e);
            throw new IllegalArgumentException("Unable to JPEG encode the Captcha Image", e);
        }

        // Get byte[] for image
        captchaImage = imageOut.toByteArray();

        return SUCCESS;
    }

    /**
     * Returns the byte stream for JPEG encoded captcha image.
     * 
     * @return byte stream for JPEG encoded captcha image
     */
    public byte[] getCaptchaImage() {
        return captchaImage;
    }

    /**
     * Returns the ImageCaptchaService implementation, obtained via the {@link JC4S2Config}.
     * 
     * @return image captcha service implementation.
     */
    protected ImageCaptchaService getImageCaptchaService() {
        return imageCaptchaService;
    }

	/**
	 * @param imageCaptchaService the imageCaptchaService to set
	 */
	public void setImageCaptchaService(ImageCaptchaService imageCaptchaService) {
		this.imageCaptchaService = imageCaptchaService;
	}
    
}
