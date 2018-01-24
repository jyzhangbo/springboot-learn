package com.github.jyzhangbo.service;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.dao.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.jyzhangbo.codes.ErrorCodes;
import com.github.jyzhangbo.content.CodeException;
import com.github.jyzhangbo.controller.model.QueryUserReq;
import com.github.jyzhangbo.controller.model.QueryUserResp;

/**
 * @author zhangbo
 *
 */
@Service
public class TestService {

  @Autowired
  private Dao dao;

  @Autowired
  private CacheService cacheService;

  public QueryUserResp index(QueryUserReq req) throws CodeException {
    QueryUserResp resp = new QueryUserResp();
    resp.ok();
    List<Record> query = dao.query("s_user", Cnd.where("USER_ID", "=", req.username));
    if (query == null || query.size() == 0) {
      throw new CodeException(ErrorCodes.ERROR_QUERY_USER.bind(req.username));
    }

    resp.userName = query.get(0).getString("USER_ID");
    resp.realName = cacheService.getRealName(resp.userName);
    resp.email = query.get(0).getString("EMAIL");
    resp.mobile = query.get(0).getString("MOBILE");

    return resp;
  }

}
