package member.infra;

import member.domain.Member;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MemberHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Member>> {

    @Override
    public EntityModel<Member> process(EntityModel<Member> model) {
        return model;
    }
}
