package test;

import java.util.List;

import Service.INewsService;
import Service.NewsService;
import models.NewsModel;

public class thaoTac {
	public static void main(String[] args) {
		INewsService news = new NewsService();
		List<NewsModel> list = news.findByCategoryId(1L);
		for(NewsModel news1 : list) {
			System.out.println(news1.toString());
		}

	}
}
