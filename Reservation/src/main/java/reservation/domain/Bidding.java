package reservation.domain;

import javax.persistence.*;
import lombok.Data;
import reservation.ReservationApplication;

@Entity
@Table(name = "Bidding_table")
@Data
public class Bidding {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long biddingId;

    private Long gameReservationId;

    private String businessId;

    private String businessName;

    private String businessPhoneNum;

    private Long biddingAmount;

    private String biddingStatus;

    public static BiddingRepository repository() {
        BiddingRepository biddingRepository = ReservationApplication.applicationContext.getBean(
            BiddingRepository.class
        );
        return biddingRepository;
    }
}
