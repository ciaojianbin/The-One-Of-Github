package a.b.service;

import a.b.pojo.Books;

import java.util.List;

/**
 * @author Jean.K
 * @TIME 2022/2/24 16:12
 */
public interface BookService {
    //增加一个Book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(Books books);
    //根据id查询,返回一个Book
    Books queryBookById(int id);
    //查询全部Book,返回list集合
    List<Books> queryAllBook();
    //按名称查询书籍
    Books queryBookByName(String bookName);
}
