public class Main {
	public static void main(String[] args) {
		
		int imgWidth = 512;
		int imgHeight = 512;
		
		int[][] heightMap = new int[imgHeight][imgWidth];
		int[][] populationDensityMap = new int[imgHeight][imgWidth];		
		
		// ==================================================================
		// Create input data for testing
		// ==================================================================
		
		// Height map
		for(int i = 0; i < heightMap.length; i++) {
			for(int j = 0; j < heightMap[i].length; j++) {
				heightMap[i][j] = 0; // may build if 1
			}
		}
		
		for(int i = 0; i < heightMap.length; i++) {
			for(int j = heightMap[i].length / 2 - 30; j < heightMap[i].length / 2 + 30; j++) {
				heightMap[i][j] = -1; // may not build if not 0
			}
		}

		// Cities
		populationDensityMap[50][50] = 1;		
		populationDensityMap[400][150] = 5;
		populationDensityMap[250][380] = 20;
		
		// ==================================================================
		
		RoadGenerator rg = new RoadGenerator();
		rg.generateRoad(heightMap, populationDensityMap);
	}

}