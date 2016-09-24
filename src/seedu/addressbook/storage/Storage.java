package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents the storage medium for address book data.
 */
public abstract class Storage {

    /**
     * Signals that the given file path does not fulfill the storage filepath constraints.
     */
    public static class InvalidStorageFilePathException extends IllegalValueException {
        public InvalidStorageFilePathException(String message) {
            super(message);
        }
    }

    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }
    
    /**
     * Saves all data to storage.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;

    /**
     * Loads data from storage.
     */
    public abstract AddressBook load() throws StorageOperationException;

    /**
     * Returns storage path.
     */
    public abstract String getPath();
}
