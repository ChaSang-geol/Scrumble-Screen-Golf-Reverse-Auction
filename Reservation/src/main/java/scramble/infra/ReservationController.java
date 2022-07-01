package scramble.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scramble.domain.*;

@RestController
@RequestMapping(value = "/reservations")
@Transactional
public class ReservationController {

    @Autowired
    ReservationRepository reservationRepository;
    // keep
}
