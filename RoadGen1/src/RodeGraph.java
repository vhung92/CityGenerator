import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by victor on 5/8/14.
 */
public class RodeGraph {
  private Set<RoadNode> nodes;
  private HashMap<RoadNode, Set<RoadEdge>> adjacencyList;

  public RodeGraph(){
    adjacencyList = new HashMap<>();
    nodes = new HashSet<>();
  }

  public void addNode(RoadNode node){
    if(!nodes.contains(node)){
      nodes.add(node);
    }
  }

  public void addEdge(RoadNode node, RoadEdge edge){
    if(!adjacencyList.containsKey(node)){
      Set<RoadEdge> roadEdges = new HashSet<>();
      roadEdges.add(edge);
      adjacencyList.put(node, roadEdges);
    }
    else if(!adjacencyList.get(node).contains(edge)){
      adjacencyList.get(node).add(edge);
    }
  }

}
