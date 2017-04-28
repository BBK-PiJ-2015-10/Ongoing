package com.plantplaces.ui;

public class PlantWSServiceProxy implements com.plantplaces.ui.PlantWSService {
  private String _endpoint = null;
  private com.plantplaces.ui.PlantWSService plantWSService = null;
  
  public PlantWSServiceProxy() {
    _initPlantWSServiceProxy();
  }
  
  public PlantWSServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPlantWSServiceProxy();
  }
  
  private void _initPlantWSServiceProxy() {
    try {
      plantWSService = (new com.plantplaces.ui.PlantWSServiceServiceLocator()).getPlantWSService();
      if (plantWSService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)plantWSService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)plantWSService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (plantWSService != null)
      ((javax.xml.rpc.Stub)plantWSService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.plantplaces.ui.PlantWSService getPlantWSService() {
    if (plantWSService == null)
      _initPlantWSServiceProxy();
    return plantWSService;
  }
  
  public java.lang.String fetchPlants(java.lang.String plantName) throws java.rmi.RemoteException{
    if (plantWSService == null)
      _initPlantWSServiceProxy();
    return plantWSService.fetchPlants(plantName);
  }
  
  
}