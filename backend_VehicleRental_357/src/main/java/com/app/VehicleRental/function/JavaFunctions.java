package com.app.VehicleRental.function;

import com.app.VehicleRental.model.RoadsideAssistance;
import com.app.VehicleRental.model.Verfication;
import com.app.VehicleRental.model.Payment;
import com.app.VehicleRental.model.ServiceCrew;
import com.app.VehicleRental.model.Insurance;
import com.app.VehicleRental.model.ExtendBooking;
import com.app.VehicleRental.model.Booking;
import com.app.VehicleRental.model.RentalCompany;
import com.app.VehicleRental.model.ReturnBikeInspection;
import com.app.VehicleRental.model.Customer;
import com.app.VehicleRental.model.Bike;
import com.app.VehicleRental.model.ReturnRentedBike;
import com.app.VehicleRental.enums.IDTypes;
import com.app.VehicleRental.converter.IDTypesConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.VehicleRental.repository.VerficationRepository;
import com.app.VehicleRental.repository.PaymentRepository;
import com.app.VehicleRental.repository.CustomerRepository;
import com.app.VehicleRental.repository.InsuranceRepository;
import com.app.VehicleRental.repository.ServiceCrewRepository;
import com.app.VehicleRental.repository.ReturnRentedBikeRepository;
import com.app.VehicleRental.repository.BookingRepository;
import com.app.VehicleRental.repository.RoadsideAssistanceRepository;
import com.app.VehicleRental.repository.ExtendBookingRepository;
import com.app.VehicleRental.repository.RentalCompanyRepository;
import com.app.VehicleRental.repository.ReturnBikeInspectionRepository;
import com.app.VehicleRental.repository.BikeRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
