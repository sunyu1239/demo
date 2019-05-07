package com.example.demo.common;

public class PageInfo {
    private int totalPage;
    private int pageLimt;
    private int totalCount;
    private int currentPage;
    private int offSet;

    public static PageInfo createPageInfo(int pageLimt) {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageLimt(pageLimt);
        pageInfo.setCurrentPage(1);
        pageInfo.setOffSet(1);
        return pageInfo;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageLimt() {
        return pageLimt;
    }

    public void setPageLimt(int pageLimt) {
        this.pageLimt = pageLimt;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }

    public void calOffSet() {
        this.offSet = (this.currentPage - 1) * this.pageLimt + 1;
    }

    public void calTotalPage() {
        this.totalPage = (this.totalCount / this.pageLimt) + (this.totalCount % this.pageLimt == 0 ? 0 : 1);
    }
}
