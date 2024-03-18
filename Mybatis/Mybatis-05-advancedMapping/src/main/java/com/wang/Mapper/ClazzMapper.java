package com.wang.Mapper;

import com.wang.POJO.Clazz;

public interface ClazzMapper {
    Clazz selectByStepOne(Integer cid);
    /***
     * 根据班级编号查询信息
     * @param cid
     * @return
     */
    Clazz selectByCollection(Integer cid);
    /***
     * 分布查询第二步
     * @param cid
     * @return
     */
    Clazz selectByIdTwo(Integer cid);
}
