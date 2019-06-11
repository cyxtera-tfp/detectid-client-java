package net.easysol.detectid.clients;

import net.easysol.detectid.web.service.WebServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jgutierrez on 1/08/2017.
 */
@XmlRootElement(name = "op:retrieveClientsList")
public class RetrieveClientsListRequest extends WebServiceRequest {

    private RetrieveClientRequest retrieveClientRequest;

    public static class RetrieveClientRequest{
        private Pagination pagination;

        public Pagination getPagination() {
            return pagination;
        }

        public RetrieveClientRequest setPagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        @Override
        public String toString() {
            return "RetrieveClientRequest{" +
                    "pagination=" + pagination +
                    '}';
        }
    }

    public static class Pagination {
        private int pageNumber;

        private int pageSize;

        public int getPageNumber() {
            return pageNumber;
        }

        public Pagination setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public int getPageSize() {
            return pageSize;
        }

        public Pagination setPageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public String toString() {
            return "Pagination{" +
                    "pageNumber=" + pageNumber +
                    ", pageSize=" + pageSize +
                    '}';
        }
    }

    public RetrieveClientRequest getRetrieveClientRequest() {
        return retrieveClientRequest;
    }

    public RetrieveClientsListRequest setRetrieveClientRequest(RetrieveClientRequest retrieveClientRequest) {
        this.retrieveClientRequest = retrieveClientRequest;
        return this;
    }

    @Override
    public String toString() {
        return "RetrieveClientsListRequest{" +
                "retrieveClientRequest=" + retrieveClientRequest +
                "} " + super.toString();
    }
}
