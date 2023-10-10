import java.util.ArrayList;
import java.util.List;

public class Scene {

public Integer id;
public List<PoligonalModel> models = new ArrayList<>();
public List<Flash> flashes;
public List<Camera> cameras;

public Scene(Integer id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras){
    this.id = id;
    this.models = models;
    this.flashes = flashes;
    this.cameras = cameras;
}

public Type method1(Type object) {
    Type returnObject = new Type();
    return returnObject;
}


public Type method2(Type object1, Type object2){
    Type returnObject = new Type();
    return returnObject;
}

}