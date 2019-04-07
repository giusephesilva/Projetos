package br.edu.uniabeu.prjteste.core.base;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jboss.logging.Logger;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseService {
	protected Logger log = Logger.getLogger(BaseService.class);

	public Integer calcTotalPages(Long totalRows, Integer totalPageRows) {
		if (totalRows > 0) {
			return new BigDecimal((float) totalRows / (float) totalPageRows).setScale(0, RoundingMode.CEILING)
					.intValue();
		}
		return 0;
	}

	public String obj2json(Object obj) {
		String json = null;
		if (obj != null) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				json = mapper.writeValueAsString(obj);
			} catch (JsonProcessingException e) {
				log.error(e.getMessage());
			}
		}
		return json;
	}

	public <T> T json2obj(String obj, Class<T> t) {
		T json = null;
		if (obj != null) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				json = mapper.readValue(obj, t);
			} catch (IOException e) {
				log.error(e.getMessage());
			}
		}
		return json;
	}
}