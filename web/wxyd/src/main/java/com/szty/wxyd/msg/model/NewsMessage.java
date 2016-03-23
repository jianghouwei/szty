package com.szty.wxyd.msg.model;

import java.util.List;

/**
 * 图文消息
 * @ClassName: NewsMessage
 * @Description: TODO()
 * @author mao.ru
 * @date 2016年1月13日 上午9:42:38
 *
 */
public class NewsMessage extends BaseMessage {
	// 图文消息个数，限制为10条以内
	private int ArticleCount;
	// 多条图文消息信息，默认第一个item为大图
	private List<Article> Articles;

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<Article> getArticles() {
		return Articles;
	}

	public void setArticles(List<Article> articles) {
		Articles = articles;
	}
}
