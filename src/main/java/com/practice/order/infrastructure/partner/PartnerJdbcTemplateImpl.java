package com.practice.order.infrastructure.partner;

import com.practice.order.domain.partner.Partner;
import com.practice.order.domain.partner.PartnerReader;
import com.practice.order.domain.partner.PartnerStore;
import org.springframework.stereotype.Component;

//example

@Component
public class PartnerJdbcTemplateImpl implements PartnerReader, PartnerStore {
    @Override
    public Partner getPartner(String partnerToken) {
        return null;
    }

    @Override
    public Partner store(Partner initPartner) {
        return null;
    }
}
