package com.ten.controller.message;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.message.MessageServiceManager;
import com.ten.service.service.message.LogService;
import com.ten.vo.LogVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ten.utils.ControllerCheckUtil.*;

/**
 * log
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/log")
public class LogController extends BaseController<LogVO, ResponseResult> {

    @Autowired
    private MessageServiceManager messageServiceManager;

    /**
     * all
     * <p>
     * 获取所有Log信息
     *
     * @return all log
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @Override
    public ResponseResult all() {
        List<LogVO> infoVOList = messageServiceManager.getAllLogs();
        checkResourceNotNull(infoVOList);
        return new ResponseResult(infoVOList);
    }

    /**
     * listById
     */
    @Override
    public ResponseResult list(LogVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(LogVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(LogVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(LogVO entity) {
        return null;
    }

    /**
     * deleteById
     */
    @Override
    public ResponseResult delete(LogVO entity) {
        return null;
    }
}
