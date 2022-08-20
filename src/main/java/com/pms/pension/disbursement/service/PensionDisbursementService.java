package com.pms.pension.disbursement.service;

import com.pms.pension.disbursement.exception.AadharNumberNotFound;
import com.pms.pension.disbursement.exception.AuthorizationException;
import com.pms.pension.disbursement.model.ProcessPensionInput;
import com.pms.pension.disbursement.model.ProcessPensionResponse;

public interface PensionDisbursementService {
	public ProcessPensionResponse getResponce(String token,ProcessPensionInput processPensionInput) throws AuthorizationException, AadharNumberNotFound;
	

}
