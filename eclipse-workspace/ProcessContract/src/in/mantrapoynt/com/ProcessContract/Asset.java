package in.mantrapoynt.com.ProcessContract;

public class Asset {
	String AssetId;
	String AssetName;
	String AssetCost;
	String AssetResidual;
	String AssetQty;
	/**
	 * @param assetId
	 * @param assetName
	 * @param assetCost
	 * @param assetResidual
	 * @param assetQty
	 */
	public Asset(String assetId, String assetName, String assetCost, String assetResidual, String assetQty) {
		super();
		AssetId = assetId;
		AssetName = assetName;
		AssetCost = assetCost;
		AssetResidual = assetResidual;
		AssetQty = assetQty;
	}
	public String getAssetId() {
		return AssetId;
	}
	public void setAssetId(String assetId) {
		AssetId = assetId;
	}
	public String getAssetName() {
		return AssetName;
	}
	public void setAssetName(String assetName) {
		AssetName = assetName;
	}
	public String getAssetCost() {
		return AssetCost;
	}
	public void setAssetCost(String assetCost) {
		AssetCost = assetCost;
	}
	public String getAssetResidual() {
		return AssetResidual;
	}
	public void setAssetResidual(String assetResidual) {
		AssetResidual = assetResidual;
	}
	public String getAssetQty() {
		return AssetQty;
	}
	public void setAssetQty(String assetQty) {
		AssetQty = assetQty;
	};
	

}
