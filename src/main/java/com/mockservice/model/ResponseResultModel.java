package com.mockservice.model;

public class ResponseResultModel {
	private ResultsModel[] results;

	public ResultsModel[] getResults() {
		return results;
	}

	public void setResults(ResultsModel[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "ClassPojo [results = " + results + "]";
	}
}
