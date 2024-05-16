package backend.real_estate.backendapi.service;

import backend.real_estate.backendapi.dto.OtpDto;
import backend.real_estate.backendapi.entity.UserBo;

import java.util.Map;

public interface OtpAuthService {

    void sendVerificationCode(String email);

    void verifyOtp(OtpDto otpDto);
}
