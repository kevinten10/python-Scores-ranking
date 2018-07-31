package com.ten.manager.record;

import com.ten.vo.AlbumVO;
import com.ten.vo.RecordCommentVO;
import com.ten.vo.RecordVO;

import java.util.List;

/**
 * Record模块管理器
 *
 * @author Administrator
 */
public interface RecordServiceManager {

    List<RecordVO> getUserRecordListByUserId(Integer userId);

    RecordVO getRecordByEntity(RecordVO entity);

    int createRecord(RecordVO entity);

    int deleteRecordByPrimaryKey(Integer recordId);

    int updateRecord(RecordVO entity);

    int createRecordComment(RecordCommentVO entity);

    int updateRecordComment(RecordCommentVO entity);

    int deleteRecordCommentByPrimaryKey(Integer id);
}
