package gestionmodelosconsultas.diagram_VIEWMODEL.part;

import gestionmodelosconsultas.entitymodel.provider.EntitymodelItemProviderAdapterFactory;
import gestionmodelosconsultas.memoms.comunicacion.provider.ComunicacionItemProviderAdapterFactory;
import gestionmodelosconsultas.memoms.info.provider.InfoItemProviderAdapterFactory;
import gestionmodelosconsultas.memoms.provider.MemomsItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.como.provider.ComoItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.cuando.provider.CuandoItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.donde.provider.DondeItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.model.provider.ModelItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.provider.ModeloconsultasItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.que.provider.QueItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.quien.provider.QuienItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.provider.ResultsetItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultque.provider.ResultqueItemProviderAdapterFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.provider.ResultquienItemProviderAdapterFactory;
import gestionmodelosconsultas.provider.GestionmodelosconsultasItemProviderAdapterFactory;
import gestionmodelosconsultas.rules.factoryrules.provider.FactoryrulesItemProviderAdapterFactory;
//rulediagramentitymodel.provider.RulediagramentitymodelItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.core.provider.CoreItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.data.docmgt.provider.DocmgtItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.data.provider.DataItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.function.provider.FunctionItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.network.provider.NetworkItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.people.provider.PeopleItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.provider.SysinfoItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.time.provider.TimeItemProviderAdapterFactory;
import gestionmodelosconsultas.sysinfo.vision.provider.VisionItemProviderAdapterFactory;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.tooling.runtime.LogHelper;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @generated
 */
public class GestionModelosConsultasDiagramEditorPlugin extends
		AbstractUIPlugin {

	/**
	 * @generated
	 */
	public static final String ID = "gestionModelosConsultas.diagram_VIEWMODEL"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private LogHelper myLogHelper;

	/**
	 * @generated
	 */
	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(
			ID);

	/**
	 * @generated
	 */
	private static GestionModelosConsultasDiagramEditorPlugin instance;

	/**
	 * @generated
	 */
	private ComposedAdapterFactory adapterFactory;

	/**
	 * @generated
	 */
	private gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDocumentProvider documentProvider;

	/**
	 * @generated
	 */
	private gestionmodelosconsultas.diagram_VIEWMODEL.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

	/**
	 * @generated
	 */
	private gestionmodelosconsultas.diagram_VIEWMODEL.providers.ElementInitializers initializers;

	/**
	 * @generated
	 */
	public GestionModelosConsultasDiagramEditorPlugin() {
	}

	/**
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		myLogHelper = new LogHelper(this);
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT,
				getPreferenceStore());
		adapterFactory = createAdapterFactory();
	}

	/**
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		linkConstraints = null;
		initializers = null;
		instance = null;
		super.stop(context);
	}

	/**
	 * @generated
	 */
	public static GestionModelosConsultasDiagramEditorPlugin getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(List<AdapterFactory> factories) {
		factories.add(new GestionmodelosconsultasItemProviderAdapterFactory());
		factories.add(new FactoryrulesItemProviderAdapterFactory());
//		factories.add(new EntitymodelItemProviderAdapterFactory());
		factories.add(new SysinfoItemProviderAdapterFactory());
		factories.add(new PeopleItemProviderAdapterFactory());
		factories.add(new DataItemProviderAdapterFactory());
		factories.add(new DocmgtItemProviderAdapterFactory());
		factories.add(new NetworkItemProviderAdapterFactory());
		factories.add(new FunctionItemProviderAdapterFactory());
		factories.add(new TimeItemProviderAdapterFactory());
		factories.add(new VisionItemProviderAdapterFactory());
		factories.add(new CoreItemProviderAdapterFactory());
		factories.add(new ModeloconsultasItemProviderAdapterFactory());
		factories.add(new QueItemProviderAdapterFactory());
		factories.add(new QuienItemProviderAdapterFactory());
		factories.add(new ComoItemProviderAdapterFactory());
		factories.add(new CuandoItemProviderAdapterFactory());
		factories.add(new DondeItemProviderAdapterFactory());
		factories.add(new ModelItemProviderAdapterFactory());
		factories.add(new ResultsetItemProviderAdapterFactory());
		factories.add(new ResultquienItemProviderAdapterFactory());
		factories.add(new ResultqueItemProviderAdapterFactory());
		factories.add(new MemomsItemProviderAdapterFactory());
		factories.add(new InfoItemProviderAdapterFactory());
		factories.add(new ComunicacionItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * @generated
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * @generated
	 */
	public ImageDescriptor getItemImageDescriptor(Object item) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory
				.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(
					labelProvider.getImage(item));
		}
		return null;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @generated
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getBundledImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}

	/**
	 * Respects images residing in any plug-in. If path is relative,
	 * then this bundle is looked up for the image, otherwise, for absolute 
	 * path, first segment is taken as id of plug-in with image
	 *
	 * @generated
	 * @param path the path to image, either absolute (with plug-in id as first segment), or relative for bundled images
	 * @return the image descriptor
	 */
	public static ImageDescriptor findImageDescriptor(String path) {
		final IPath p = new Path(path);
		if (p.isAbsolute() && p.segmentCount() > 1) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0), p
					.removeFirstSegments(1).makeAbsolute().toString());
		} else {
			return getBundledImageDescriptor(p.makeAbsolute().toString());
		}
	}

	/**
	 * Returns an image for the image file at the given plug-in relative path.
	 * Client do not need to dispose this image. Images will be disposed automatically.
	 *
	 * @generated
	 * @param path the path
	 * @return image instance
	 */
	public Image getBundledImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image == null) {
			getImageRegistry().put(path, getBundledImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}

	/**
	 * Returns string from plug-in's resource bundle
	 *
	 * @generated
	 */
	public static String getString(String key) {
		return Platform.getResourceString(getInstance().getBundle(), "%" + key); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDocumentProvider getDocumentProvider() {
		if (documentProvider == null) {
			documentProvider = new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDocumentProvider();
		}
		return documentProvider;
	}

	/**
	 * @generated
	 */
	public gestionmodelosconsultas.diagram_VIEWMODEL.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
		return linkConstraints;
	}

	/**
	 * @generated
	 */
	public void setLinkConstraints(
			gestionmodelosconsultas.diagram_VIEWMODEL.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy.LinkConstraints lc) {
		this.linkConstraints = lc;
	}

	/**
	 * @generated
	 */
	public gestionmodelosconsultas.diagram_VIEWMODEL.providers.ElementInitializers getElementInitializers() {
		return initializers;
	}

	/**
	 * @generated
	 */
	public void setElementInitializers(
			gestionmodelosconsultas.diagram_VIEWMODEL.providers.ElementInitializers i) {
		this.initializers = i;
	}

	/**
	 * @generated
	 */
	public void logError(String error) {
		getLogHelper().logError(error, null);
	}

	/**
	 * @generated
	 */
	public void logError(String error, Throwable throwable) {
		getLogHelper().logError(error, throwable);
	}

	/**
	 * @generated
	 */
	public void logInfo(String message) {
		getLogHelper().logInfo(message, null);
	}

	/**
	 * @generated
	 */
	public void logInfo(String message, Throwable throwable) {
		getLogHelper().logInfo(message, throwable);
	}

	/**
	 * @generated
	 */
	public LogHelper getLogHelper() {
		return myLogHelper;
	}

}
