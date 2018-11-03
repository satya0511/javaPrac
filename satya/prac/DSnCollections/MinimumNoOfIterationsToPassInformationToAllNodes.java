package satya.prac.DSnCollections;

	import java.util.Collections;
	import java.util.ArrayList;
	 
	class NAryTree {
		int N;
		
		ArrayList<ArrayList<Integer>> arr;
	 
		public NAryTree(int N) {
			this.N = N;
			arr = new ArrayList<ArrayList<Integer>>(N);
			for(int i=0;i<N;i++)
				
				arr.add(new ArrayList<Integer>());
		}
	 
		public void addChild(int u, int v) {
			arr.get(u).add(v);
		}
	 
		public void getMinIterUtil(int u, int[] minIter) {
			ArrayList<Integer> currList = arr.get(u);
			minIter[u] = currList.size();
			ArrayList<Integer> minIterTemp = new ArrayList<Integer>(currList.size());
			int k = 0,temp = 0;
			for(int i=0;i<currList.size();i++) {
				getMinIterUtil(currList.get(i),minIter);
				minIterTemp.add(k++,minIter[currList.get(i)]);
			}
	 
			Collections.sort(minIterTemp,Collections.reverseOrder());
			for(int i=0;i<currList.size();i++)
				minIter[u] = Math.max(minIter[u],minIterTemp.get(i)+i+1);
		}
	 
		public int getMinIter() {
			int[] minIter = new int[N];
			for(int i=0;i<N;i++)
				minIter[i] = 0;
			getMinIterUtil(0,minIter);
			return minIter[0];
		}	
	}
	class MinimumNoOfIterationsToPassInformationToAllNodes {
		public static void main(String[] args) {
			NAryTree tree = new NAryTree(27);
	 
			tree.addChild(0, 1);
			tree.addChild(0, 2);
			tree.addChild(0, 3);
			tree.addChild(0, 4);
			tree.addChild(0, 5);
			tree.addChild(0, 6);
			
	 
			tree.addChild(1, 7);
			tree.addChild(1, 8);
			tree.addChild(1, 9);
	 
			tree.addChild(4, 10);
			tree.addChild(4, 11);
	 
			tree.addChild(6, 12);
	 
			
			
			tree.addChild(10, 15);
			tree.addChild(11, 16);
			
			tree.addChild(12, 17);
			tree.addChild(12, 18);
			tree.addChild(12, 19);
			
			tree.addChild(17, 20);
			tree.addChild(17, 21);
			
			
			tree.addChild(20, 22);
			tree.addChild(20, 23);
			
			tree.addChild(22, 24);
			tree.addChild(22, 25);
			tree.addChild(22, 26);
			
			printTreeStructure(tree);
			
			System.out.println(tree.getMinIter());
		}

		private static void printTreeStructure(NAryTree tree) {
			// TODO Auto-generated method stub
			
			
		}
	}
