package scramble.domain;

import java.util.Date;
import lombok.Data;
import scramble.domain.*;
import scramble.infra.AbstractEvent;

@Data
public class ReservationCancelSent extends AbstractEvent {

    private Long notiId;
    private String receiverPhoneNum;
    private String content;
    private String senderPhoneNum;
    private Date sendDate;
    private String notiFlag;
    private Long gameReservationId;

    public ReservationCancelSent(Notice aggregate) {
        super(aggregate);
    }

    public ReservationCancelSent() {
        super();
    }
    // keep

}
