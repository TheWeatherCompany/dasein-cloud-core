package org.dasein.cloud.platform.support.model.options;

/**
 * @author Eugene Yaroslavtsev
 * @since 19.08.2014
 */
public class TicketCreateAttachmentsOptions {

    private TicketAttachmentDataOptions[] attachments;

    public TicketAttachmentDataOptions[] getAttachments() {
        return attachments;
    }

    public void setAttachments( TicketAttachmentDataOptions[] attachments ) {
        this.attachments = attachments;
    }

}
