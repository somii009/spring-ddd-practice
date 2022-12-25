package com.practice.order.interfaces.partner;

import com.practice.order.application.partner.PartnerFacade;
import com.practice.order.common.response.CommonResponse;
import com.practice.order.domain.partner.PartnerCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/partners")
public class PartnerApiController {
    private final PartnerFacade partnerFacade;

    @PostMapping
    public CommonResponse registerPartner(PartnerDto.RegisterRequest request) {
        // 1. 외부에서 전달된 파라미터 (dto) -> Command, Criteria로 convert
        // 2. facade 호출 .. PartnerInfo
        // 3. PartnerInfo -> CommonResponse convert AND return

        var command = request.toCommand();
        var partnerInfo = partnerFacade.registerPartner(command);
        var response = new PartnerDto.RegisterResponse(partnerInfo);
        return CommonResponse.success(response);
    }
}
