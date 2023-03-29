package com.example.sample.coffee.mapper;

import com.example.sample.coffee.dto.CoffeePatchDto;
import com.example.sample.coffee.dto.CoffeePostDto;
import com.example.sample.coffee.dto.CoffeeResponseDto;
import com.example.sample.coffee.entity.Coffee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-14T00:20:46+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.17 (Azul Systems, Inc.)"
)
@Component
public class CoffeeMapperImpl implements CoffeeMapper {

    @Override
    public Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto) {
        if ( coffeePostDto == null ) {
            return null;
        }

        Coffee coffee = new Coffee();

        coffee.setKorname( coffeePostDto.getKorname() );
        coffee.setEngname( coffeePostDto.getEngname() );
        coffee.setPrice( coffeePostDto.getPrice() );

        return coffee;
    }

    @Override
    public Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto) {
        if ( coffeePatchDto == null ) {
            return null;
        }

        Coffee coffee = new Coffee();

        coffee.setCoffeeId( coffeePatchDto.getCoffeeId() );
        coffee.setKorname( coffeePatchDto.getKorname() );
        coffee.setEngname( coffeePatchDto.getEngname() );
        coffee.setPrice( coffeePatchDto.getPrice() );

        return coffee;
    }

    @Override
    public CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee) {
        if ( coffee == null ) {
            return null;
        }

        String korname = null;
        String engname = null;
        int price = 0;

        korname = coffee.getKorname();
        engname = coffee.getEngname();
        price = coffee.getPrice();

        CoffeeResponseDto coffeeResponseDto = new CoffeeResponseDto( korname, engname, price );

        return coffeeResponseDto;
    }
}
