package com.company.project.core;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @program: spring-boot-api-project-seed
 * @description: 自定义分页类
 * @author: YP
 * @create: 2019-01-25 09:41
 **/
public class MyPageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 当前页
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 当前页数量
     */
    private int size;
    /**
     * 总页数
     */
    private int pages;
    /**
     * 总记录数
     */
    private long total;
    /**
     * 结果集
     */
    private List<T> list;

    public MyPageInfo(){

    }

    public MyPageInfo(List<T> list){
        if (list instanceof Page) {
            Page page = (Page)list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.pages = page.getPages();
            this.list = page;
            this.size = page.size();
            this.total = page.getTotal();
        } else if (list instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = list.size();
            this.pages = 1;
            this.list = list;
            this.size = list.size();
            this.total = (long)list.size();
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public MyPageInfo<T> setPageNum(int pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public MyPageInfo<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getSize() {
        return size;
    }

    public MyPageInfo<T> setSize(int size) {
        this.size = size;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public MyPageInfo<T> setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public long getTotal() {
        return total;
    }

    public MyPageInfo<T> setTotal(long total) {
        this.total = total;
        return this;
    }

    public List<T> getList() {
        return list;
    }

    public MyPageInfo<T> setList(List<T> list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        return "MyPageInfo{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", size=" + size +
                ", pages=" + pages +
                ", total=" + total +
                ", list=" + list +
                '}';
    }
}
