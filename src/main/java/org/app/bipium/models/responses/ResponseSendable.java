package org.app.bipium.models.responses;

import org.app.bipium.models.catalogs.Catalog;

public interface ResponseSendable {
    void getRequest(int catalogID, String searchValue);
    void postRequest(String searchValue);

}
