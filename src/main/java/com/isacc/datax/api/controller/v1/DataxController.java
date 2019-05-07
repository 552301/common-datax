package com.isacc.datax.api.controller.v1;

import com.isacc.datax.api.dto.ApiResult;
import com.isacc.datax.api.dto.Mysql2HiveDTO;
import com.isacc.datax.app.service.DataxMysql2HiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * Datax Controller
 * </p>
 *
 * @author isacc 2019/04/29 14:13
 */
@RestController("dataxController.v1")
@RequestMapping("/datax")
public class DataxController {

	private final DataxMysql2HiveService mysql2HiveService;

	@Autowired
	public DataxController(DataxMysql2HiveService mysql2HiveService) {
		this.mysql2HiveService = mysql2HiveService;
	}

	@PostMapping("/mysql-hive")
	public ApiResult<Object> mysql2Hive(@RequestBody Mysql2HiveDTO mysql2HiveDTO) {
		return mysql2HiveService.mysql2Hive(mysql2HiveDTO);
	}

}
