package Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pipe implements IInstrument {
    private double diameter;

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром: " + getDiameter());
    }
}
