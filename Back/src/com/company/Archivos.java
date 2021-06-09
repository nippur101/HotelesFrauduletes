package com.company;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;

public class Archivos {

    /// -------------------------------------------------- SERIALIZACION USUARIOS --------------------------------------------------
    public static void escribirArchivoUsuarioHotel(File fileUsuarioHotel, ArrayList<UsuarioHotel> listaUsuarioHotel){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileUsuarioHotel));

            GsonBuilder gsonBilder = new GsonBuilder();
            gsonBilder.registerTypeAdapter(UsuarioHotel.class, new AbstractElementAdapter());
            Gson gson = gsonBilder.create();

            Type listOfUsuarioHotelObject = new TypeToken<ArrayList<UsuarioHotel>>() {}.getType();
            gson.toJson(listaUsuarioHotel, listOfUsuarioHotelObject, bufferedWriter);

            bufferedWriter.close();

        } catch (IOException e){
            System.out.println("ERROR al Escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /// -------------------------------------------------- DESERIALIZACION HABITACIONES --------------------------------------------------
    public static ArrayList<UsuarioHotel> leerArchivoUsuarioHotel (File fileUsuarioHotel) {

        ArrayList<UsuarioHotel> listaUsuarioHotel = new ArrayList<UsuarioHotel>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileUsuarioHotel));

            GsonBuilder gsonBilder = new GsonBuilder();
            gsonBilder.registerTypeAdapter(UsuarioHotel.class, new AbstractElementAdapter());
            Gson gson = gsonBilder.create();


            Type listOfUsuarioHotelnObject = new TypeToken<ArrayList<UsuarioHotel>>() {
            }.getType();


            listaUsuarioHotel=(gson.fromJson(bufferedReader, listOfUsuarioHotelnObject));

        } catch (
                IOException e) {
            System.out.println("ERROR al Leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return listaUsuarioHotel;
    }

    /// -------------------------------------------------- SERIALIZACION CLIENTES --------------------------------------------------

    public static void escribirArchivoClientes(File fileCliente, ArrayList<Cliente> listaCliente) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileCliente));
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                    .create();


            Type listOfClienteObject = new TypeToken<ArrayList<Cliente>>() {
            }.getType();
            gson.toJson(listaCliente, listOfClienteObject, bufferedWriter);

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR al Escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /// -------------------------------------------------- DESERIALIZACION CLIENTES --------------------------------------------------

    public static ArrayList<Cliente> leerArchivoClientes (File fileCliente) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileCliente));

            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
                @Override
                public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
                }
            }).create();

            Type listOfClienteObject = new TypeToken<ArrayList<Cliente>>() {
            }.getType();

            listaCliente=(gson.fromJson(bufferedReader, listOfClienteObject));


        } catch (IOException e) {
            System.out.println("ERROR al Leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return listaCliente;
    }
    /// -------------------------------------------------- SERIALIZACION HABITACIONES --------------------------------------------------
    public static void escribirArchivoHabitacion (File fileHabitaciones, ArrayList<Habitacion> listaHabitaciones) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileHabitaciones));

            Gson gson = new Gson();

            Type listOfHabitacionObject = new TypeToken<ArrayList<Habitacion>>() {
            }.getType();
            gson.toJson(listaHabitaciones, listOfHabitacionObject, bufferedWriter);

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR al Escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /// -------------------------------------------------- DESERIALIZACION HABITACIONES --------------------------------------------------
    public static ArrayList<Habitacion> leerArchivoHabitacion (File fileHabitaciones) {
        ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileHabitaciones));

            Gson gson = new Gson();

            Type listOfHabitacionObject = new TypeToken<ArrayList<Habitacion>>() {}.getType();

            listaHabitaciones=(gson.fromJson(bufferedReader, listOfHabitacionObject));

            Habitacion.setContadorHabitaciones(listaHabitaciones.get((listaHabitaciones.size()-1)).getId());

        } catch (IOException e){
            System.out.println("ERROR al Leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return listaHabitaciones;
    }
    /// -------------------------------------------------- SERIALIZACION RESERVAS --------------------------------------------------
    public static void escribirArchivoReservas(File fileReservas, ArrayList<Reserva> listaReserva) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileReservas));
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                    .create();


            Type listOfReservaObject = new TypeToken<ArrayList<Reserva>>() {
            }.getType();
            gson.toJson(listaReserva, listOfReservaObject, bufferedWriter);

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR al Escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /// -------------------------------------------------- DESERIALIZACION RESERVAS --------------------------------------------------
    public static ArrayList<Reserva> leerArchivoReservas (File fileReservas) {
        ArrayList<Reserva> listaReserva = new ArrayList<Reserva>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileReservas));

            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
                @Override
                public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
                }
            }).create();

            Type listOfReservaObject = new TypeToken<ArrayList<Reserva>>() {
            }.getType();

            listaReserva=(gson.fromJson(bufferedReader, listOfReservaObject));

            Reserva.setContadorReservas(listaReserva.get((listaReserva.size()-1)).getId());

        } catch (IOException e) {
            System.out.println("ERROR al Leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return listaReserva;
    }

    /// -------------------------------------------------- SERIALIZACION REGISTRO HUESPED --------------------------------------------------
    public static void escribirArchivoRegistroHuesped(File fileRegistroHuesped, ArrayList<RegistroHuesped> listaRegistroHuesped) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileRegistroHuesped));
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                    .create();


            Type listOfRegistroHuespedObject = new TypeToken<ArrayList<RegistroHuesped>>() {
            }.getType();
            gson.toJson(listaRegistroHuesped, listOfRegistroHuespedObject, bufferedWriter);

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR al Escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /// -------------------------------------------------- DESERIALIZACION REGISTRO HUESPED --------------------------------------------------
    public static ArrayList<RegistroHuesped> leerArchivoRegistroHuesped (File fileRegistroHuesped) {
        ArrayList<RegistroHuesped> listaRegistroHuesped = new ArrayList<RegistroHuesped>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRegistroHuesped));

            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
                @Override
                public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
                }
            }).create();

            Type listOfRegistroHuespedObject = new TypeToken<ArrayList<RegistroHuesped>>() {
            }.getType();

            listaRegistroHuesped=(gson.fromJson(bufferedReader, listOfRegistroHuespedObject));

            RegistroHuesped.setContadorRegHuesped(listaRegistroHuesped.get(listaRegistroHuesped.size()-1).getId());

        } catch (IOException e) {
            System.out.println("ERROR al Leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return listaRegistroHuesped;
    }

    /// -------------------------------------------------- SERIALIZACION MANTENIMIENTO --------------------------------------------------
    public static void escribirArchivoMantenimiento(File fileMantenimiento, ArrayList<Mantenimiento> listaMantenimiento) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileMantenimiento));
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                    .create();


            Type listOfMantenimientoObject = new TypeToken<ArrayList<Mantenimiento>>() {
            }.getType();
            gson.toJson(listaMantenimiento, listOfMantenimientoObject, bufferedWriter);

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR al Escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /// -------------------------------------------------- DESERIALIZACION REGISTRO HUESPED --------------------------------------------------
    public static ArrayList<Mantenimiento> leerArchivoMantenimiento (File fileMantenimiento) {
        ArrayList<Mantenimiento> listaMantenimiento = new ArrayList<Mantenimiento>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileMantenimiento));

            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
                @Override
                public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
                }
            }).create();

            Type listOfMantenimientoObject = new TypeToken<ArrayList<Mantenimiento>>() {
            }.getType();

            listaMantenimiento=(gson.fromJson(bufferedReader, listOfMantenimientoObject));

            Mantenimiento.setContadorMantenimiento(listaMantenimiento.get(listaMantenimiento.size()-1).getId());

        } catch (IOException e) {
            System.out.println("ERROR al Leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return listaMantenimiento;
    }
}
