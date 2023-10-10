import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    public List<IModelChangedObserver> changedObservers;

    public ModelStore(List <IModelChangedObserver> changedObservers){
        models = new ArrayList<>();
        scenes = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
        this.changedObservers = changedObservers;

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    public Scene getScene(Integer id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
        }

        
        @Override
        public void notifyChange (IModelChanger sender){

        }
    // public PoligonalModel[] Models
    // { get ; set}=Array.Empty<PoligonalModel>();

    // public List<Scene> Scenes
    // {get; set}=new();

    // public Flash[] Flashes
    // { get; set; }=Array.Empty<Flash>();

    // public Camera[] Cameras
    // { get; set; }=Array.Empty<Camera>();

    // private IModelChangedObserver[] _changedObservers =
    // Array.Empty<IModelChangedObserver>();

}