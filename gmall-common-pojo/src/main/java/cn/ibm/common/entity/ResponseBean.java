package cn.ibm.common.entity;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;


public class ResponseBean<T> {

	private String status;

	private String errorCode;

	private String detailMessages;

	private T responseBody;

	public static ResponseBean ok() {
		ResponseBean bean = new ResponseBean();
		bean.setStatus("SUCCESS");
		return bean;
	}

	public static <S> ResponseBean ok(S resp) {
		ResponseBean bean = new ResponseBean<S>();
		bean.setStatus("SUCCESS");
		bean.setResponseBody(resp);
		return bean;
	}

	public static <S> ResponseBean<S> ok(Page<S> resp) {
		ResponseBean bean = new ResponseBean<S>();
		bean.setStatus("SUCCESS");

		ResponEntity<S> respe = new ResponEntity<S>();

		respe.setCurrentPage(resp.getCurrent());
		respe.setPageCount(resp.getPages());
		respe.setPageSize(resp.getSize());
		respe.setTotal(resp.getTotal());
		respe.setRecords(resp.getRecords());

		bean.setResponseBody(respe);
		return bean;
	}

	public static ResponseBean err(String errorCode, String errMsg) {
		ResponseBean bean = new ResponseBean();
		bean.setStatus("ERROR");
		bean.setErrorCode(errorCode);
		bean.setDetailMessages(errMsg);
		return bean;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getDetailMessages() {
		return detailMessages;
	}

	public void setDetailMessages(String detailMessages) {
		this.detailMessages = detailMessages;
	}

	public T getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(T responseBody) {
		this.responseBody = responseBody;
	}

}

class ResponEntity<T> {

	private long pageCount;
	private long total;
	private long pageSize;
	private long currentPage;

	private List<T> records;

	public long getPageCount() {
		return pageCount;
	}

	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	public long getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(long currentPage) {
		this.currentPage = currentPage;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

}