package tk.mybatis.simple.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.simple.model.SysUser;

public interface SysUserMapper {
	public SysUser selectById(int id);

	public List<SysUser> selectAll();
}