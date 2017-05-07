package cn.mldn.vshop.service.back;

import java.util.List;
import java.util.Map;

import cn.mldn.vshop.vo.Item;
import cn.mldn.vshop.vo.Subitem;

public interface IItemServiceBack {

	/**
	 * 列出所有的一级菜单一级该菜单所含有的所有二级菜单信息：<br/>
	 * 1.使用IItemDAO.findAll()方法查询出所有的一级栏目。<br/>
	 * 2.根据所有查询所得的一级菜单找到该菜单包含的所有二级菜单。<br/>
	 * @return Map集合的key为一级菜单信息，value为其对应的二级菜单信息。<br/>
	 * @throws Exception SQL异常
	 */
	public Map<Item, List<Subitem>> listDetails() throws Exception;
	/**
	 * 实现所有的栏目信息列表，调用IItemDAO.findAll()
	 * @return 所有的栏目数据
	 * @throws Exception SQL异常
	 */
	public List<Item> list() throws Exception ;
	/**
	 * 实现栏目信息名称的变更处理操作，调用IItemDAO.doUpdate()方法
	 * @param vo 包含有修改数据的对象
	 * @return 修改成功返回true
	 * @throws Exception SQL异常
	 */
	public boolean edit(Item vo) throws Exception ;
}
