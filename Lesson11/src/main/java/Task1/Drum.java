package Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Drum implements IInstrument {
    private int size;

    @Override
    public void play() {
        System.out.println("Играет барабан с размером: " + getSize());
    }
}
