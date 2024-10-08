package rastak.train.ws.service;

import rastak.train.ws.model.dto.FormDto;
import rastak.train.ws.model.entity.FormEntity;

import java.util.List;
import java.util.Map;

public interface FormService {

    void createForm(Map<String, List<String>> fieldData);

    List<FormDto> getAllForms();
}
