/**
 */
package org.nasdanika.amur.lang.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.amur.lang.FileReference;
import org.nasdanika.amur.lang.FileReferenceLanguage;
import org.nasdanika.amur.lang.Filer;
import org.nasdanika.amur.lang.LangPackage;
import org.nasdanika.amur.lang.Language;
import org.nasdanika.amur.lang.Source;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.lang.FileReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileReferenceItemProvider
	extends SourceItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileReferenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileReference_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileReference_path_feature", "_UI_FileReference_type"),
				 LangPackage.Literals.FILE_REFERENCE__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FileReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Object linkImage = org.nasdanika.common.Activator.getImageDescriptor("icons/led/link.png");
		if (object instanceof Source) {
			Language<? extends Source> lang = ((Source) object).getLanguage();
			if (lang instanceof FileReferenceLanguage) {
				Filer<?> filer = ((FileReferenceLanguage<?>) lang).getFiler();
				if (filer!=null) {
					IItemLabelProvider labelProvider = (IItemLabelProvider) getRootAdapterFactory().adapt(filer, IItemLabelProvider.class);
					if (labelProvider!=null) {
						Object ret = labelProvider.getImage(lang);
						if (ret!=null) {
							if (linkImage!=null) {
							      List<Object> images = new ArrayList<Object>(2);
							      images.add(ret);
							      images.add(linkImage);
							      return new ComposedImage(images);							
							}
							return ret;
						}
					}
				}
			}
		}

		return getImage(object, overlayImage(object, getResourceLocator().getImage("full/obj16/FileReference")));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((FileReference)object).getPath();
		Language<? extends Source> lang = ((Source) object).getLanguage();
		if (lang instanceof FileReferenceLanguage && ((FileReferenceLanguage<?>) lang).getFiler() instanceof Language) {
			return "["+((Language<?>) ((FileReferenceLanguage<?>) lang).getFiler()).getName() +" file reference] "+label;			
		} else if (lang!=null) {
			return "["+lang.getName()+"] "+label;
		}
			
		return label == null || label.length() == 0 ?
			getString("_UI_FileReference_type") :
			getString("_UI_FileReference_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FileReference.class)) {
			case LangPackage.FILE_REFERENCE__PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
