package javax.frame.tools.mybatis.mapper;

import javax.frame.tools.mybatis.model.SysNginxLog;

public interface SysNginxLogMapper {
    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated
     */
    int insert(SysNginxLog record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(SysNginxLog record);

    /**
     *
     * @mbg.generated
     */
    SysNginxLog selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysNginxLog record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(SysNginxLog record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysNginxLog record);
}