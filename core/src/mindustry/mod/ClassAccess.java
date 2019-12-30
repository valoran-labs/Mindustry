package mindustry.mod;

import arc.struct.*;
//obviously autogenerated, do not touch
public class ClassAccess{
	public static final ObjectSet<String> allowedClassNames = ObjectSet.with("arc.Core", "arc.func.Boolc", "arc.func.Boolf", "arc.func.Boolf2", "arc.func.Boolp", "arc.func.Cons", "arc.func.Cons2", "arc.func.Floatc", "arc.func.Floatc2", "arc.func.Floatc4", "arc.func.Floatf", "arc.func.Floatp", "arc.func.Func", "arc.func.Func2", "arc.func.Func3", "arc.func.Intc", "arc.func.Intc2", "arc.func.Intc4", "arc.func.Intf", "arc.func.Intp", "arc.func.Prov", "arc.graphics.Color", "arc.graphics.Pixmap", "arc.graphics.Texture", "arc.graphics.TextureData", "arc.graphics.g2d.Draw", "arc.graphics.g2d.Fill", "arc.graphics.g2d.Lines", "arc.graphics.g2d.TextureAtlas", "arc.graphics.g2d.TextureAtlas$AtlasRegion", "arc.graphics.g2d.TextureRegion", "arc.math.Affine2", "arc.math.Angles", "arc.math.Angles", "arc.math.Angles$ParticleConsumer", "arc.math.CumulativeDistribution", "arc.math.CumulativeDistribution$CumulativeValue", "arc.math.DelaunayTriangulator", "arc.math.EarClippingTriangulator", "arc.math.Extrapolator", "arc.math.FloatCounter", "arc.math.Interpolation", "arc.math.Interpolation$Bounce", "arc.math.Interpolation$BounceIn", "arc.math.Interpolation$BounceOut", "arc.math.Interpolation$Elastic", "arc.math.Interpolation$ElasticIn", "arc.math.Interpolation$ElasticOut", "arc.math.Interpolation$Exp", "arc.math.Interpolation$ExpIn", "arc.math.Interpolation$ExpOut", "arc.math.Interpolation$Pow", "arc.math.Interpolation$PowIn", "arc.math.Interpolation$PowOut", "arc.math.Interpolation$Swing", "arc.math.Interpolation$SwingIn", "arc.math.Interpolation$SwingOut", "arc.math.Mathf", "arc.math.Mathf", "arc.math.Matrix3", "arc.math.WindowedMean", "arc.math.geom.BSpline", "arc.math.geom.Bezier", "arc.math.geom.Bresenham2", "arc.math.geom.CatmullRomSpline", "arc.math.geom.Circle", "arc.math.geom.ConvexHull", "arc.math.geom.Ellipse", "arc.math.geom.FixedPosition", "arc.math.geom.Geometry", "arc.math.geom.Geometry$Raycaster", "arc.math.geom.Geometry$SolidChecker", "arc.math.geom.Intersector", "arc.math.geom.Intersector$MinimumTranslationVector", "arc.math.geom.Path", "arc.math.geom.Point2", "arc.math.geom.Point3", "arc.math.geom.Polygon", "arc.math.geom.Polyline", "arc.math.geom.Position", "arc.math.geom.QuadTree", "arc.math.geom.QuadTree$QuadTreeObject", "arc.math.geom.Rect", "arc.math.geom.Shape2D", "arc.math.geom.Spring1D", "arc.math.geom.Spring2D", "arc.math.geom.Vec2", "arc.math.geom.Vec3", "arc.math.geom.Vector", "arc.scene.Action", "arc.scene.Element", "arc.scene.Group", "arc.scene.Scene", "arc.scene.actions.Actions", "arc.scene.actions.AddAction", "arc.scene.actions.AddListenerAction", "arc.scene.actions.AfterAction", "arc.scene.actions.AlphaAction", "arc.scene.actions.ColorAction", "arc.scene.actions.DelayAction", "arc.scene.actions.DelegateAction", "arc.scene.actions.FloatAction", "arc.scene.actions.IntAction", "arc.scene.actions.LayoutAction", "arc.scene.actions.MoveByAction", "arc.scene.actions.MoveToAction", "arc.scene.actions.OriginAction", "arc.scene.actions.ParallelAction", "arc.scene.actions.RelativeTemporalAction", "arc.scene.actions.RemoveAction", "arc.scene.actions.RemoveActorAction", "arc.scene.actions.RemoveListenerAction", "arc.scene.actions.RepeatAction", "arc.scene.actions.RotateByAction", "arc.scene.actions.RotateToAction", "arc.scene.actions.RunnableAction", "arc.scene.actions.ScaleByAction", "arc.scene.actions.ScaleToAction", "arc.scene.actions.SequenceAction", "arc.scene.actions.SizeByAction", "arc.scene.actions.SizeToAction", "arc.scene.actions.TemporalAction", "arc.scene.actions.TimeScaleAction", "arc.scene.actions.TouchableAction", "arc.scene.actions.TranslateByAction", "arc.scene.actions.VisibleAction", "arc.scene.event.ChangeListener", "arc.scene.event.ChangeListener$ChangeEvent", "arc.scene.event.ClickListener", "arc.scene.event.DragListener", "arc.scene.event.DragScrollListener", "arc.scene.event.ElementGestureListener", "arc.scene.event.EventListener", "arc.scene.event.FocusListener", "arc.scene.event.FocusListener$FocusEvent", "arc.scene.event.FocusListener$FocusEvent$Type", "arc.scene.event.HandCursorListener", "arc.scene.event.IbeamCursorListener", "arc.scene.event.InputEvent", "arc.scene.event.InputEvent$Type", "arc.scene.event.InputListener", "arc.scene.event.SceneEvent", "arc.scene.event.Touchable", "arc.scene.event.VisibilityEvent", "arc.scene.event.VisibilityListener", "arc.scene.style.BaseDrawable", "arc.scene.style.Drawable", "arc.scene.style.NinePatchDrawable", "arc.scene.style.ScaledNinePatchDrawable", "arc.scene.style.Style", "arc.scene.style.TextureRegionDrawable", "arc.scene.style.TiledDrawable", "arc.scene.style.TransformDrawable", "arc.scene.ui.Button", "arc.scene.ui.Button$ButtonStyle", "arc.scene.ui.ButtonGroup", "arc.scene.ui.CheckBox", "arc.scene.ui.CheckBox$CheckBoxStyle", "arc.scene.ui.ColorImage", "arc.scene.ui.Dialog", "arc.scene.ui.Dialog$DialogStyle", "arc.scene.ui.Image", "arc.scene.ui.ImageButton", "arc.scene.ui.ImageButton$ImageButtonStyle", "arc.scene.ui.KeybindDialog", "arc.scene.ui.KeybindDialog$KeybindDialogStyle", "arc.scene.ui.Label", "arc.scene.ui.Label$LabelStyle", "arc.scene.ui.ProgressBar", "arc.scene.ui.ProgressBar$ProgressBarStyle", "arc.scene.ui.ScrollPane", "arc.scene.ui.ScrollPane$ScrollPaneStyle", "arc.scene.ui.SettingsDialog", "arc.scene.ui.SettingsDialog$SettingsTable", "arc.scene.ui.SettingsDialog$SettingsTable$CheckSetting", "arc.scene.ui.SettingsDialog$SettingsTable$Setting", "arc.scene.ui.SettingsDialog$SettingsTable$SliderSetting", "arc.scene.ui.SettingsDialog$StringProcessor", "arc.scene.ui.Slider", "arc.scene.ui.Slider$SliderStyle", "arc.scene.ui.TextArea", "arc.scene.ui.TextArea$TextAreaListener", "arc.scene.ui.TextButton", "arc.scene.ui.TextButton$TextButtonStyle", "arc.scene.ui.TextField", "arc.scene.ui.TextField$DefaultOnscreenKeyboard", "arc.scene.ui.TextField$OnscreenKeyboard", "arc.scene.ui.TextField$TextFieldClickListener", "arc.scene.ui.TextField$TextFieldFilter", "arc.scene.ui.TextField$TextFieldListener", "arc.scene.ui.TextField$TextFieldStyle", "arc.scene.ui.TextField$TextFieldValidator", "arc.scene.ui.Tooltip", "arc.scene.ui.Tooltip$Tooltips", "arc.scene.ui.Touchpad", "arc.scene.ui.Touchpad$TouchpadStyle", "arc.scene.ui.TreeElement", "arc.scene.ui.TreeElement$Node", "arc.scene.ui.TreeElement$TreeStyle", "arc.scene.ui.layout.Cell", "arc.scene.ui.layout.Collapser", "arc.scene.ui.layout.HorizontalGroup", "arc.scene.ui.layout.Scl", "arc.scene.ui.layout.Stack", "arc.scene.ui.layout.Table", "arc.scene.ui.layout.Table$DrawRect", "arc.scene.ui.layout.VerticalGroup", "arc.scene.ui.layout.WidgetGroup", "arc.scene.utils.ArraySelection", "arc.scene.utils.Cullable", "arc.scene.utils.Disableable", "arc.scene.utils.DragAndDrop", "arc.scene.utils.DragAndDrop$Payload", "arc.scene.utils.DragAndDrop$Source", "arc.scene.utils.DragAndDrop$Target", "arc.scene.utils.Elements", "arc.scene.utils.Layout", "arc.scene.utils.Selection", "arc.struct.Array", "arc.struct.Array$ArrayIterable", "arc.struct.ArrayMap", "arc.struct.ArrayMap$Entries", "arc.struct.ArrayMap$Keys", "arc.struct.ArrayMap$Values", "arc.struct.AtomicQueue", "arc.struct.BinaryHeap", "arc.struct.BinaryHeap$Node", "arc.struct.Bits", "arc.struct.BooleanArray", "arc.struct.ByteArray", "arc.struct.CharArray", "arc.struct.ComparableTimSort", "arc.struct.DelayedRemovalArray", "arc.struct.EnumSet", "arc.struct.EnumSet$EnumSetIterator", "arc.struct.FloatArray", "arc.struct.GridBits", "arc.struct.GridMap", "arc.struct.IdentityMap", "arc.struct.IdentityMap$Entries", "arc.struct.IdentityMap$Entry", "arc.struct.IdentityMap$Keys", "arc.struct.IdentityMap$Values", "arc.struct.IntArray", "arc.struct.IntFloatMap", "arc.struct.IntFloatMap$Entries", "arc.struct.IntFloatMap$Entry", "arc.struct.IntFloatMap$Keys", "arc.struct.IntFloatMap$Values", "arc.struct.IntIntMap", "arc.struct.IntIntMap$Entries", "arc.struct.IntIntMap$Entry", "arc.struct.IntIntMap$Keys", "arc.struct.IntIntMap$Values", "arc.struct.IntMap", "arc.struct.IntMap$Entries", "arc.struct.IntMap$Entry", "arc.struct.IntMap$Keys", "arc.struct.IntMap$Values", "arc.struct.IntQueue", "arc.struct.IntSet", "arc.struct.IntSet$IntSetIterator", "arc.struct.LongArray", "arc.struct.LongMap", "arc.struct.LongMap$Entries", "arc.struct.LongMap$Entry", "arc.struct.LongMap$Keys", "arc.struct.LongMap$Values", "arc.struct.LongQueue", "arc.struct.ObjectFloatMap", "arc.struct.ObjectFloatMap$Entries", "arc.struct.ObjectFloatMap$Entry", "arc.struct.ObjectFloatMap$Keys", "arc.struct.ObjectFloatMap$Values", "arc.struct.ObjectIntMap", "arc.struct.ObjectIntMap$Entries", "arc.struct.ObjectIntMap$Entry", "arc.struct.ObjectIntMap$Keys", "arc.struct.ObjectIntMap$Values", "arc.struct.ObjectMap", "arc.struct.ObjectMap$Entries", "arc.struct.ObjectMap$Entry", "arc.struct.ObjectMap$Keys", "arc.struct.ObjectMap$Values", "arc.struct.ObjectSet", "arc.struct.ObjectSet$ObjectSetIterator", "arc.struct.OrderedMap", "arc.struct.OrderedMap$OrderedMapEntries", "arc.struct.OrderedMap$OrderedMapKeys", "arc.struct.OrderedMap$OrderedMapValues", "arc.struct.OrderedSet", "arc.struct.OrderedSet$OrderedSetIterator", "arc.struct.PooledLinkedList", "arc.struct.PooledLinkedList$Item", "arc.struct.Queue", "arc.struct.Queue$QueueIterable", "arc.struct.ShortArray", "arc.struct.SnapshotArray", "arc.struct.Sort", "arc.struct.SortedIntList", "arc.struct.SortedIntList$Iterator", "arc.struct.SortedIntList$Node", "arc.struct.StringMap", "arc.struct.TimSort", "arc.util.I18NBundle", "arc.util.Interval", "arc.util.Time", "java.io.DataInput", "java.io.DataInputStream", "java.io.DataOutput", "java.io.DataOutputStream", "java.io.PrintStream", "java.lang.Object", "java.lang.Runnable", "java.lang.String", "java.lang.System", "mindustry.Vars", "mindustry.ai.BlockIndexer", "mindustry.ai.Pathfinder", "mindustry.ai.Pathfinder$PathData", "mindustry.ai.Pathfinder$PathTarget", "mindustry.ai.Pathfinder$PathTileStruct", "mindustry.ai.WaveSpawner", "mindustry.content.Blocks", "mindustry.content.Bullets", "mindustry.content.Fx", "mindustry.content.Items", "mindustry.content.Liquids", "mindustry.content.Loadouts", "mindustry.content.Mechs", "mindustry.content.StatusEffects", "mindustry.content.TechTree", "mindustry.content.TechTree$TechNode", "mindustry.content.TypeIDs", "mindustry.content.UnitTypes", "mindustry.content.Zones", "mindustry.core.ContentLoader", "mindustry.core.Control", "mindustry.core.FileTree", "mindustry.core.GameState", "mindustry.core.GameState$State", "mindustry.core.Logic", "mindustry.core.NetServer$TeamAssigner", "mindustry.core.Platform", "mindustry.core.Renderer", "mindustry.core.UI", "mindustry.core.Version", "mindustry.core.World", "mindustry.core.World$Raycaster", "mindustry.ctype.Content", "mindustry.ctype.Content$ModContentInfo", "mindustry.ctype.ContentList", "mindustry.ctype.ContentType", "mindustry.ctype.MappableContent", "mindustry.ctype.UnlockableContent", "mindustry.editor.DrawOperation", "mindustry.editor.DrawOperation$OpType", "mindustry.editor.DrawOperation$TileOpStruct", "mindustry.editor.EditorTile", "mindustry.editor.EditorTool", "mindustry.editor.MapEditor", "mindustry.editor.MapEditor$Context", "mindustry.editor.MapEditorDialog", "mindustry.editor.MapGenerateDialog", "mindustry.editor.MapInfoDialog", "mindustry.editor.MapLoadDialog", "mindustry.editor.MapRenderer", "mindustry.editor.MapResizeDialog", "mindustry.editor.MapSaveDialog", "mindustry.editor.MapView", "mindustry.editor.OperationStack", "mindustry.editor.WaveInfoDialog", "mindustry.entities.Damage", "mindustry.entities.Damage$PropCellStruct", "mindustry.entities.Effects", "mindustry.entities.Effects$Effect", "mindustry.entities.Effects$EffectContainer", "mindustry.entities.Effects$EffectProvider", "mindustry.entities.Effects$EffectRenderer", "mindustry.entities.Effects$ScreenshakeProvider", "mindustry.entities.Entities", "mindustry.entities.EntityCollisions", "mindustry.entities.EntityGroup", "mindustry.entities.Predict", "mindustry.entities.TargetPriority", "mindustry.entities.Units", "mindustry.entities.bullet.ArtilleryBulletType", "mindustry.entities.bullet.BasicBulletType", "mindustry.entities.bullet.BombBulletType", "mindustry.entities.bullet.BulletType", "mindustry.entities.bullet.FlakBulletType", "mindustry.entities.bullet.HealBulletType", "mindustry.entities.bullet.LiquidBulletType", "mindustry.entities.bullet.MassDriverBolt", "mindustry.entities.bullet.MissileBulletType", "mindustry.entities.effect.Decal", "mindustry.entities.effect.Fire", "mindustry.entities.effect.GroundEffectEntity", "mindustry.entities.effect.GroundEffectEntity$GroundEffect", "mindustry.entities.effect.ItemTransfer", "mindustry.entities.effect.Lightning", "mindustry.entities.effect.Puddle", "mindustry.entities.effect.RubbleDecal", "mindustry.entities.effect.ScorchDecal", "mindustry.entities.traits.AbsorbTrait", "mindustry.entities.traits.BelowLiquidTrait", "mindustry.entities.traits.BuilderMinerTrait", "mindustry.entities.traits.BuilderTrait", "mindustry.entities.traits.BuilderTrait$BuildDataStatic", "mindustry.entities.traits.BuilderTrait$BuildRequest", "mindustry.entities.traits.DamageTrait", "mindustry.entities.traits.DrawTrait", "mindustry.entities.traits.Entity", "mindustry.entities.traits.HealthTrait", "mindustry.entities.traits.KillerTrait", "mindustry.entities.traits.MinerTrait", "mindustry.entities.traits.MoveTrait", "mindustry.entities.traits.SaveTrait", "mindustry.entities.traits.Saveable", "mindustry.entities.traits.ScaleTrait", "mindustry.entities.traits.ShooterTrait", "mindustry.entities.traits.SolidTrait", "mindustry.entities.traits.SpawnerTrait", "mindustry.entities.traits.SyncTrait", "mindustry.entities.traits.TargetTrait", "mindustry.entities.traits.TeamTrait", "mindustry.entities.traits.TimeTrait", "mindustry.entities.traits.TypeTrait", "mindustry.entities.traits.VelocityTrait", "mindustry.entities.type.BaseEntity", "mindustry.entities.type.BaseUnit", "mindustry.entities.type.Bullet", "mindustry.entities.type.DestructibleEntity", "mindustry.entities.type.EffectEntity", "mindustry.entities.type.Player", "mindustry.entities.type.SolidEntity", "mindustry.entities.type.TileEntity", "mindustry.entities.type.TimedEntity", "mindustry.entities.type.Unit", "mindustry.entities.type.base.BaseDrone", "mindustry.entities.type.base.BuilderDrone", "mindustry.entities.type.base.FlyingUnit", "mindustry.entities.type.base.GroundUnit", "mindustry.entities.type.base.HoverUnit", "mindustry.entities.type.base.MinerDrone", "mindustry.entities.type.base.RepairDrone", "mindustry.entities.units.StateMachine", "mindustry.entities.units.Statuses", "mindustry.entities.units.Statuses$StatusEntry", "mindustry.entities.units.UnitCommand", "mindustry.entities.units.UnitDrops", "mindustry.entities.units.UnitState", "mindustry.game.DefaultWaves", "mindustry.game.Difficulty", "mindustry.game.EventType", "mindustry.game.EventType$BlockBuildBeginEvent", "mindustry.game.EventType$BlockBuildEndEvent", "mindustry.game.EventType$BlockDestroyEvent", "mindustry.game.EventType$BlockInfoEvent", "mindustry.game.EventType$BuildSelectEvent", "mindustry.game.EventType$ClientLoadEvent", "mindustry.game.EventType$CommandIssueEvent", "mindustry.game.EventType$ContentReloadEvent", "mindustry.game.EventType$CoreItemDeliverEvent", "mindustry.game.EventType$DepositEvent", "mindustry.game.EventType$DisposeEvent", "mindustry.game.EventType$GameOverEvent", "mindustry.game.EventType$LaunchEvent", "mindustry.game.EventType$LaunchItemEvent", "mindustry.game.EventType$LineConfirmEvent", "mindustry.game.EventType$LoseEvent", "mindustry.game.EventType$MapMakeEvent", "mindustry.game.EventType$MapPublishEvent", "mindustry.game.EventType$MechChangeEvent", "mindustry.game.EventType$PlayEvent", "mindustry.game.EventType$PlayerBanEvent", "mindustry.game.EventType$PlayerChatEvent", "mindustry.game.EventType$PlayerConnect", "mindustry.game.EventType$PlayerIpBanEvent", "mindustry.game.EventType$PlayerIpUnbanEvent", "mindustry.game.EventType$PlayerJoin", "mindustry.game.EventType$PlayerLeave", "mindustry.game.EventType$PlayerUnbanEvent", "mindustry.game.EventType$ResearchEvent", "mindustry.game.EventType$ResetEvent", "mindustry.game.EventType$ResizeEvent", "mindustry.game.EventType$ServerLoadEvent", "mindustry.game.EventType$StateChangeEvent", "mindustry.game.EventType$TapConfigEvent", "mindustry.game.EventType$TapEvent", "mindustry.game.EventType$TileChangeEvent", "mindustry.game.EventType$Trigger", "mindustry.game.EventType$TurretAmmoDeliverEvent", "mindustry.game.EventType$UnitCreateEvent", "mindustry.game.EventType$UnitDestroyEvent", "mindustry.game.EventType$UnlockEvent", "mindustry.game.EventType$WaveEvent", "mindustry.game.EventType$WinEvent", "mindustry.game.EventType$WithdrawEvent", "mindustry.game.EventType$WorldLoadEvent", "mindustry.game.EventType$ZoneConfigureCompleteEvent", "mindustry.game.EventType$ZoneRequireCompleteEvent", "mindustry.game.Gamemode", "mindustry.game.GlobalData", "mindustry.game.LoopControl", "mindustry.game.MusicControl", "mindustry.game.Objective", "mindustry.game.Objectives", "mindustry.game.Objectives$Launched", "mindustry.game.Objectives$Unlock", "mindustry.game.Objectives$Wave", "mindustry.game.Objectives$ZoneObjective", "mindustry.game.Objectives$ZoneWave", "mindustry.game.Rules", "mindustry.game.Saves", "mindustry.game.Saves$SaveSlot", "mindustry.game.Schematic", "mindustry.game.Schematic$Stile", "mindustry.game.Schematics", "mindustry.game.SoundLoop", "mindustry.game.SpawnGroup", "mindustry.game.Stats", "mindustry.game.Stats$Rank", "mindustry.game.Stats$RankResult", "mindustry.game.Team", "mindustry.game.Teams", "mindustry.game.Teams$BrokenBlock", "mindustry.game.Teams$TeamData", "mindustry.game.Tutorial", "mindustry.game.Tutorial$TutorialStage", "mindustry.gen.BufferItem", "mindustry.gen.Call", "mindustry.gen.Call", "mindustry.gen.Icon", "mindustry.gen.Icon", "mindustry.gen.MethodHash", "mindustry.gen.Musics", "mindustry.gen.Musics", "mindustry.gen.PathTile", "mindustry.gen.PropCell", "mindustry.gen.RemoteReadClient", "mindustry.gen.RemoteReadServer", "mindustry.gen.Serialization", "mindustry.gen.Sounds", "mindustry.gen.Sounds", "mindustry.gen.Tex", "mindustry.gen.Tex", "mindustry.gen.TileOp", "mindustry.graphics.BlockRenderer", "mindustry.graphics.Bloom", "mindustry.graphics.CacheLayer", "mindustry.graphics.Drawf", "mindustry.graphics.FloorRenderer", "mindustry.graphics.IndexedRenderer", "mindustry.graphics.Layer", "mindustry.graphics.LightRenderer", "mindustry.graphics.MenuRenderer", "mindustry.graphics.MinimapRenderer", "mindustry.graphics.MultiPacker", "mindustry.graphics.MultiPacker$PageType", "mindustry.graphics.OverlayRenderer", "mindustry.graphics.Pal", "mindustry.graphics.Pixelator", "mindustry.graphics.Shaders", "mindustry.input.Binding", "mindustry.input.DesktopInput", "mindustry.input.InputHandler", "mindustry.input.InputHandler$PlaceLine", "mindustry.input.MobileInput", "mindustry.input.PlaceMode", "mindustry.input.Placement", "mindustry.input.Placement$DistanceHeuristic", "mindustry.input.Placement$NormalizeDrawResult", "mindustry.input.Placement$NormalizeResult", "mindustry.input.Placement$TileHueristic", "mindustry.maps.Map", "mindustry.maps.Maps", "mindustry.maps.Maps$MapProvider", "mindustry.maps.Maps$ShuffleMode", "mindustry.maps.Maps$ShuffleMode", "mindustry.maps.filters.BlendFilter", "mindustry.maps.filters.ClearFilter", "mindustry.maps.filters.DistortFilter", "mindustry.maps.filters.FilterOption", "mindustry.maps.filters.FilterOption$BlockOption", "mindustry.maps.filters.FilterOption$SliderOption", "mindustry.maps.filters.GenerateFilter", "mindustry.maps.filters.GenerateFilter$GenerateInput", "mindustry.maps.filters.GenerateFilter$GenerateInput$TileProvider", "mindustry.maps.filters.MedianFilter", "mindustry.maps.filters.MirrorFilter", "mindustry.maps.filters.NoiseFilter", "mindustry.maps.filters.OreFilter", "mindustry.maps.filters.OreMedianFilter", "mindustry.maps.filters.RiverNoiseFilter", "mindustry.maps.filters.ScatterFilter", "mindustry.maps.filters.TerrainFilter", "mindustry.maps.generators.BasicGenerator", "mindustry.maps.generators.BasicGenerator$DistanceHeuristic", "mindustry.maps.generators.BasicGenerator$TileHueristic", "mindustry.maps.generators.Generator", "mindustry.maps.generators.MapGenerator", "mindustry.maps.generators.MapGenerator$Decoration", "mindustry.maps.generators.RandomGenerator", "mindustry.maps.zonegen.DesertWastesGenerator", "mindustry.maps.zonegen.OvergrowthGenerator", "mindustry.type.Category", "mindustry.type.ErrorContent", "mindustry.type.Item", "mindustry.type.ItemStack", "mindustry.type.ItemType", "mindustry.type.Liquid", "mindustry.type.LiquidStack", "mindustry.type.Mech", "mindustry.type.Publishable", "mindustry.type.StatusEffect", "mindustry.type.StatusEffect$TransitionHandler", "mindustry.type.TypeID", "mindustry.type.UnitType", "mindustry.type.Weapon", "mindustry.type.WeatherEvent", "mindustry.type.Zone", "mindustry.ui.Bar", "mindustry.ui.BorderImage", "mindustry.ui.Cicon", "mindustry.ui.ContentDisplay", "mindustry.ui.Fonts", "mindustry.ui.GridImage", "mindustry.ui.IconSize", "mindustry.ui.IntFormat", "mindustry.ui.ItemDisplay", "mindustry.ui.ItemImage", "mindustry.ui.ItemsDisplay", "mindustry.ui.Links", "mindustry.ui.Links$LinkEntry", "mindustry.ui.LiquidDisplay", "mindustry.ui.Minimap", "mindustry.ui.MobileButton", "mindustry.ui.MultiReqImage", "mindustry.ui.ReqImage", "mindustry.ui.Styles", "mindustry.ui.dialogs.AboutDialog", "mindustry.ui.dialogs.AdminsDialog", "mindustry.ui.dialogs.BansDialog", "mindustry.ui.dialogs.ColorPicker", "mindustry.ui.dialogs.ContentInfoDialog", "mindustry.ui.dialogs.ControlsDialog", "mindustry.ui.dialogs.CustomGameDialog", "mindustry.ui.dialogs.CustomRulesDialog", "mindustry.ui.dialogs.DatabaseDialog", "mindustry.ui.dialogs.DeployDialog", "mindustry.ui.dialogs.DeployDialog$View", "mindustry.ui.dialogs.DeployDialog$ZoneNode", "mindustry.ui.dialogs.DiscordDialog", "mindustry.ui.dialogs.FileChooser", "mindustry.ui.dialogs.FileChooser$FileHistory", "mindustry.ui.dialogs.FloatingDialog", "mindustry.ui.dialogs.GameOverDialog", "mindustry.ui.dialogs.HostDialog", "mindustry.ui.dialogs.JoinDialog", "mindustry.ui.dialogs.JoinDialog$Server", "mindustry.ui.dialogs.LanguageDialog", "mindustry.ui.dialogs.LoadDialog", "mindustry.ui.dialogs.LoadoutDialog", "mindustry.ui.dialogs.MapPlayDialog", "mindustry.ui.dialogs.MapsDialog", "mindustry.ui.dialogs.MinimapDialog", "mindustry.ui.dialogs.ModsDialog", "mindustry.ui.dialogs.PaletteDialog", "mindustry.ui.dialogs.PausedDialog", "mindustry.ui.dialogs.SaveDialog", "mindustry.ui.dialogs.SchematicsDialog", "mindustry.ui.dialogs.SchematicsDialog$SchematicImage", "mindustry.ui.dialogs.SchematicsDialog$SchematicInfoDialog", "mindustry.ui.dialogs.SettingsMenuDialog", "mindustry.ui.dialogs.TechTreeDialog", "mindustry.ui.dialogs.TechTreeDialog$LayoutNode", "mindustry.ui.dialogs.TechTreeDialog$TechTreeNode", "mindustry.ui.dialogs.TechTreeDialog$View", "mindustry.ui.dialogs.TraceDialog", "mindustry.ui.dialogs.ZoneInfoDialog", "mindustry.ui.fragments.BlockConfigFragment", "mindustry.ui.fragments.BlockInventoryFragment", "mindustry.ui.fragments.ChatFragment", "mindustry.ui.fragments.FadeInFragment", "mindustry.ui.fragments.Fragment", "mindustry.ui.fragments.HudFragment", "mindustry.ui.fragments.LoadingFragment", "mindustry.ui.fragments.MenuFragment", "mindustry.ui.fragments.OverlayFragment", "mindustry.ui.fragments.PlacementFragment", "mindustry.ui.fragments.PlayerListFragment", "mindustry.ui.fragments.ScriptConsoleFragment", "mindustry.ui.layout.BranchTreeLayout", "mindustry.ui.layout.BranchTreeLayout$TreeAlignment", "mindustry.ui.layout.BranchTreeLayout$TreeLocation", "mindustry.ui.layout.RadialTreeLayout", "mindustry.ui.layout.TreeLayout", "mindustry.ui.layout.TreeLayout$TreeNode", "mindustry.world.Block", "mindustry.world.BlockStorage", "mindustry.world.Build", "mindustry.world.CachedTile", "mindustry.world.DirectionalItemBuffer", "mindustry.world.DirectionalItemBuffer$BufferItemStruct", "mindustry.world.Edges", "mindustry.world.ItemBuffer", "mindustry.world.LegacyColorMapper", "mindustry.world.LegacyColorMapper$LegacyBlock", "mindustry.world.Pos", "mindustry.world.StaticTree", "mindustry.world.Tile", "mindustry.world.WorldContext", "mindustry.world.blocks.Attributes", "mindustry.world.blocks.Autotiler", "mindustry.world.blocks.Autotiler$AutotilerHolder", "mindustry.world.blocks.BlockPart", "mindustry.world.blocks.BuildBlock", "mindustry.world.blocks.BuildBlock$BuildEntity", "mindustry.world.blocks.DoubleOverlayFloor", "mindustry.world.blocks.Floor", "mindustry.world.blocks.ItemSelection", "mindustry.world.blocks.LiquidBlock", "mindustry.world.blocks.OreBlock", "mindustry.world.blocks.OverlayFloor", "mindustry.world.blocks.PowerBlock", "mindustry.world.blocks.RespawnBlock", "mindustry.world.blocks.Rock", "mindustry.world.blocks.StaticWall", "mindustry.world.blocks.TreeBlock", "mindustry.world.blocks.defense.DeflectorWall", "mindustry.world.blocks.defense.DeflectorWall$DeflectorEntity", "mindustry.world.blocks.defense.Door", "mindustry.world.blocks.defense.Door$DoorEntity", "mindustry.world.blocks.defense.ForceProjector", "mindustry.world.blocks.defense.ForceProjector$ForceEntity", "mindustry.world.blocks.defense.ForceProjector$ShieldEntity", "mindustry.world.blocks.defense.MendProjector", "mindustry.world.blocks.defense.MendProjector$MendEntity", "mindustry.world.blocks.defense.OverdriveProjector", "mindustry.world.blocks.defense.OverdriveProjector$OverdriveEntity", "mindustry.world.blocks.defense.ShockMine", "mindustry.world.blocks.defense.SurgeWall", "mindustry.world.blocks.defense.Wall", "mindustry.world.blocks.defense.turrets.ArtilleryTurret", "mindustry.world.blocks.defense.turrets.BurstTurret", "mindustry.world.blocks.defense.turrets.ChargeTurret", "mindustry.world.blocks.defense.turrets.ChargeTurret$LaserTurretEntity", "mindustry.world.blocks.defense.turrets.CooledTurret", "mindustry.world.blocks.defense.turrets.DoubleTurret", "mindustry.world.blocks.defense.turrets.ItemTurret", "mindustry.world.blocks.defense.turrets.ItemTurret$ItemEntry", "mindustry.world.blocks.defense.turrets.ItemTurret$ItemTurretEntity", "mindustry.world.blocks.defense.turrets.LaserTurret", "mindustry.world.blocks.defense.turrets.LaserTurret$LaserTurretEntity", "mindustry.world.blocks.defense.turrets.LiquidTurret", "mindustry.world.blocks.defense.turrets.PowerTurret", "mindustry.world.blocks.defense.turrets.Turret", "mindustry.world.blocks.defense.turrets.Turret$AmmoEntry", "mindustry.world.blocks.defense.turrets.Turret$TurretEntity", "mindustry.world.blocks.distribution.ArmoredConveyor", "mindustry.world.blocks.distribution.BufferedItemBridge", "mindustry.world.blocks.distribution.BufferedItemBridge$BufferedItemBridgeEntity", "mindustry.world.blocks.distribution.Conveyor", "mindustry.world.blocks.distribution.Conveyor$ConveyorEntity", "mindustry.world.blocks.distribution.Conveyor$ItemPos", "mindustry.world.blocks.distribution.ExtendingItemBridge", "mindustry.world.blocks.distribution.ItemBridge", "mindustry.world.blocks.distribution.ItemBridge$ItemBridgeEntity", "mindustry.world.blocks.distribution.Junction", "mindustry.world.blocks.distribution.Junction$JunctionEntity", "mindustry.world.blocks.distribution.MassDriver", "mindustry.world.blocks.distribution.MassDriver$DriverBulletData", "mindustry.world.blocks.distribution.MassDriver$DriverState", "mindustry.world.blocks.distribution.MassDriver$MassDriverEntity", "mindustry.world.blocks.distribution.OverflowGate", "mindustry.world.blocks.distribution.OverflowGate$OverflowGateEntity", "mindustry.world.blocks.distribution.Router", "mindustry.world.blocks.distribution.Router$RouterEntity", "mindustry.world.blocks.distribution.Sorter", "mindustry.world.blocks.distribution.Sorter$SorterEntity", "mindustry.world.blocks.liquid.ArmoredConduit", "mindustry.world.blocks.liquid.Conduit", "mindustry.world.blocks.liquid.Conduit$ConduitEntity", "mindustry.world.blocks.liquid.LiquidBridge", "mindustry.world.blocks.liquid.LiquidExtendingBridge", "mindustry.world.blocks.liquid.LiquidJunction", "mindustry.world.blocks.liquid.LiquidOverflowGate", "mindustry.world.blocks.liquid.LiquidRouter", "mindustry.world.blocks.liquid.LiquidTank", "mindustry.world.blocks.logic.LogicBlock", "mindustry.world.blocks.logic.MessageBlock", "mindustry.world.blocks.logic.MessageBlock$MessageBlockEntity", "mindustry.world.blocks.power.Battery", "mindustry.world.blocks.power.BurnerGenerator", "mindustry.world.blocks.power.ConditionalConsumePower", "mindustry.world.blocks.power.DecayGenerator", "mindustry.world.blocks.power.ImpactReactor", "mindustry.world.blocks.power.ImpactReactor$FusionReactorEntity", "mindustry.world.blocks.power.ItemLiquidGenerator", "mindustry.world.blocks.power.ItemLiquidGenerator$ItemLiquidGeneratorEntity", "mindustry.world.blocks.power.LightBlock", "mindustry.world.blocks.power.LightBlock$LightEntity", "mindustry.world.blocks.power.NuclearReactor", "mindustry.world.blocks.power.NuclearReactor$NuclearReactorEntity", "mindustry.world.blocks.power.PowerDiode", "mindustry.world.blocks.power.PowerDistributor", "mindustry.world.blocks.power.PowerGenerator", "mindustry.world.blocks.power.PowerGenerator$GeneratorEntity", "mindustry.world.blocks.power.PowerGraph", "mindustry.world.blocks.power.PowerNode", "mindustry.world.blocks.power.SingleTypeGenerator", "mindustry.world.blocks.power.SolarGenerator", "mindustry.world.blocks.power.ThermalGenerator", "mindustry.world.blocks.production.Cultivator", "mindustry.world.blocks.production.Cultivator$CultivatorEntity", "mindustry.world.blocks.production.Drill", "mindustry.world.blocks.production.Drill$DrillEntity", "mindustry.world.blocks.production.Fracker", "mindustry.world.blocks.production.Fracker$FrackerEntity", "mindustry.world.blocks.production.GenericCrafter", "mindustry.world.blocks.production.GenericCrafter$GenericCrafterEntity", "mindustry.world.blocks.production.GenericSmelter", "mindustry.world.blocks.production.Incinerator", "mindustry.world.blocks.production.Incinerator$IncineratorEntity", "mindustry.world.blocks.production.LiquidConverter", "mindustry.world.blocks.production.Pump", "mindustry.world.blocks.production.Separator", "mindustry.world.blocks.production.SolidPump", "mindustry.world.blocks.production.SolidPump$SolidPumpEntity", "mindustry.world.blocks.sandbox.ItemSource", "mindustry.world.blocks.sandbox.ItemSource$ItemSourceEntity", "mindustry.world.blocks.sandbox.ItemVoid", "mindustry.world.blocks.sandbox.LiquidSource", "mindustry.world.blocks.sandbox.LiquidSource$LiquidSourceEntity", "mindustry.world.blocks.sandbox.PowerSource", "mindustry.world.blocks.sandbox.PowerVoid", "mindustry.world.blocks.storage.CoreBlock", "mindustry.world.blocks.storage.CoreBlock$CoreEntity", "mindustry.world.blocks.storage.LaunchPad", "mindustry.world.blocks.storage.StorageBlock", "mindustry.world.blocks.storage.StorageBlock$StorageBlockEntity", "mindustry.world.blocks.storage.Unloader", "mindustry.world.blocks.storage.Unloader$UnloaderEntity", "mindustry.world.blocks.storage.Vault", "mindustry.world.blocks.units.CommandCenter", "mindustry.world.blocks.units.CommandCenter$CommandCenterEntity", "mindustry.world.blocks.units.MechPad", "mindustry.world.blocks.units.MechPad$MechFactoryEntity", "mindustry.world.blocks.units.RallyPoint", "mindustry.world.blocks.units.RepairPoint", "mindustry.world.blocks.units.RepairPoint$RepairPointEntity", "mindustry.world.blocks.units.UnitFactory", "mindustry.world.blocks.units.UnitFactory$UnitFactoryEntity", "mindustry.world.consumers.Consume", "mindustry.world.consumers.ConsumeItemFilter", "mindustry.world.consumers.ConsumeItems", "mindustry.world.consumers.ConsumeLiquid", "mindustry.world.consumers.ConsumeLiquidBase", "mindustry.world.consumers.ConsumeLiquidFilter", "mindustry.world.consumers.ConsumePower", "mindustry.world.consumers.ConsumeType", "mindustry.world.consumers.Consumers", "mindustry.world.meta.Attribute", "mindustry.world.meta.BlockBars", "mindustry.world.meta.BlockFlag", "mindustry.world.meta.BlockGroup", "mindustry.world.meta.BlockStat", "mindustry.world.meta.BlockStats", "mindustry.world.meta.BuildVisibility", "mindustry.world.meta.PowerType", "mindustry.world.meta.Producers", "mindustry.world.meta.StatCategory", "mindustry.world.meta.StatUnit", "mindustry.world.meta.StatValue", "mindustry.world.meta.values.AmmoListValue", "mindustry.world.meta.values.BooleanValue", "mindustry.world.meta.values.BoosterListValue", "mindustry.world.meta.values.ItemFilterValue", "mindustry.world.meta.values.ItemListValue", "mindustry.world.meta.values.LiquidFilterValue", "mindustry.world.meta.values.LiquidValue", "mindustry.world.meta.values.NumberValue", "mindustry.world.meta.values.StringValue", "mindustry.world.modules.BlockModule", "mindustry.world.modules.ConsumeModule", "mindustry.world.modules.ItemModule", "mindustry.world.modules.ItemModule$ItemCalculator", "mindustry.world.modules.ItemModule$ItemConsumer", "mindustry.world.modules.LiquidModule", "mindustry.world.modules.LiquidModule$LiquidCalculator", "mindustry.world.modules.LiquidModule$LiquidConsumer", "mindustry.world.modules.PowerModule", "mindustry.world.producers.Produce", "mindustry.world.producers.ProduceItem");
}