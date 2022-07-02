package scramble.domain;

import java.util.Date;
import lombok.Data;
import scramble.domain.*;
import scramble.infra.AbstractEvent;

@Data
public class BusinessRegistCompleteNotiSent extends AbstractEvent {

    private Long notiId;
    private String receiverPhoneNum;
    private String content;
    private String senderPhoneNum;
    private Date sendDate;
    private String notiFlag;

    public BusinessRegistCompleteNotiSent(Notice aggregate) {
        super(aggregate);
    }

    public BusinessRegistCompleteNotiSent() {
        super();
    }
    // keep

}