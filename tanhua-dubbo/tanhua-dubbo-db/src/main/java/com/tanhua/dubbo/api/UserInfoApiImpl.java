package com.tanhua.dubbo.api;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tanhua.dubbo.mappers.UserInfoMapper;
import com.tanhua.model.domain.UserInfo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

@DubboService
public class UserInfoApiImpl implements UserInfoApi{
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void save(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.updateById(userInfo);
    }

    @Override
    public UserInfo findById(Long id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public Map<Long, UserInfo> findByIds(List<Long> ids, UserInfo userInfo) {
        QueryWrapper qw = new QueryWrapper();

        qw.in("id",ids);

        if(userInfo != null) {
            if(userInfo.getAge() != null) {
                qw.lt("age",userInfo.getAge());
            }
            if(!StringUtils.isEmpty(userInfo.getGender())) {
                qw.eq("gender",userInfo.getGender());
            }
            if(!StringUtils.isEmpty(userInfo.getNickname())) {
                qw.eq("nickname",userInfo.getNickname());
            }
        }
        List<UserInfo> list = userInfoMapper.selectList(qw);
        Map<Long, UserInfo> map = CollUtil.fieldValueMap(list,"id");
        return map;
    }

    @Override
    public IPage findAll(Integer page, Integer pagesize) {
        return userInfoMapper.selectPage(new Page<UserInfo>(page,pagesize),null);
    }
}
