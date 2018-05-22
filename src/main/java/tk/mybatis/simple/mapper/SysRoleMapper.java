package tk.mybatis.simple.mapper;

import java.util.List;

import tk.mybatis.simple.model.SysRole;

public interface SysRoleMapper {
	public List<SysRole> selectRoleById(Integer id);
}