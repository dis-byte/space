package cdnkxy.com.service;

import java.util.List;

import cdnkxy.com.entity.Shenbao;

/*
 * ҵ���߼���
 * ��dao�����Ӧ
 */
public interface ShenbaoService {
	public void saveShenbao(Shenbao shenbao);
	public void updateShenbao(Shenbao shenbao);
	public void deleteShenbao(Shenbao shenbao);
	public Shenbao findShenbaoById(int id);
	public Shenbao findShenbaoByName(String name);
	public List<Shenbao> findAll();
}
