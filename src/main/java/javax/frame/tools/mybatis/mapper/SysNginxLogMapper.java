package javax.frame.tools.mybatis.mapper;

import javax.frame.tools.mybatis.model.SysNginxLog;

public interface SysNginxLogMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated
     */
    int insert(SysNginxLog record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SysNginxLog record);

    /**
     *
     * @mbggenerated
     */
    SysNginxLog selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysNginxLog record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(SysNginxLog record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysNginxLog record);
}