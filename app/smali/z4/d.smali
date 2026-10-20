.class public final Lz4/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final A:Lp9/q0;

.field public final B:Lp9/q0;

.field public final C:Lp9/z;

.field public final D:Lp9/q0;

.field public final E:Lp9/z;

.field public final F:Lp9/q0;

.field public final G:Lp9/z;

.field public final H:Lp9/q0;

.field public final I:Lp9/z;

.field public final J:Lp9/q0;

.field public final K:Lp9/z;

.field public final L:Ljava/lang/String;

.field public final M:Lp9/q0;

.field public final N:Lp9/z;

.field public final a:Landroid/content/Context;

.field public final b:Lz4/b;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Lp7/n;

.field public final e:Lp9/q0;

.field public final f:Lp9/z;

.field public final n:Lp9/q0;

.field public final o:Lp9/z;

.field public final p:Lp9/q0;

.field public final q:Lp9/z;

.field public final r:Lp9/q0;

.field public final s:Lp9/z;

.field public final t:Lp9/q0;

.field public final u:Lp9/z;

.field public final v:Lp9/q0;

.field public final w:Lp9/z;

.field public final x:Lp9/q0;

.field public final y:Lp9/z;

.field public final z:Lp9/q0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz4/b;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "context"

    invoke-static {v0, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "encryptedPreferencesManager"

    invoke-static {v2, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lz4/d;->a:Landroid/content/Context;

    iput-object v2, v1, Lz4/d;->b:Lz4/b;

    invoke-static/range {p1 .. p1}, Lo1/s;->D(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v0, "getDefaultSharedPreferences(...)"

    invoke-static {v3, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    new-instance v0, Lp7/n;

    invoke-direct {v0}, Lp7/n;-><init>()V

    iput-object v0, v1, Lz4/d;->d:Lp7/n;

    const-string v4, "location_filter_enabled"

    const-string v5, "max_drop_km"

    const-string v6, "min_drop_km"

    const-string v7, "max_pickup_km"

    const-string v8, "min_pickup_km"

    const-string v9, "distance_filter_enabled"

    const-string v10, "migrated_to_encrypted_v1"

    const/4 v11, 0x0

    invoke-interface {v3, v10, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    const-string v13, "sec_location_filter_enabled"

    const-string v14, "sec_distance_filter_enabled"

    const/4 v15, 0x1

        goto :cond_0

    :cond_0
    :try_start_0
    const-string v12, "plan_expiry"

    move-object/from16 p1, v0

    const-wide/16 v0, 0x0

    invoke-interface {v3, v12, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    const-wide v11, 0x7fffffffffffffffL

    cmp-long v0, v11, v0

    if-lez v0, :cond_1

    invoke-virtual/range {p2 .. p2}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "sec_plan_expiry_ms"

    invoke-interface {v0, v1, v11, v12}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    invoke-interface {v3, v9}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {v3, v9, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual/range {p2 .. p2}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v14, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_2
    :goto_0
    invoke-interface {v3, v8}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v3, v8, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v8

    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v8

    const-string v9, "sec_min_pickup_km"

    invoke-interface {v8, v9, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_3
    invoke-interface {v3, v7}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 v0, 0x42480000    # 50.0f

    invoke-interface {v3, v7, v0}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v7

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    const-string v8, "sec_max_pickup_km"

    invoke-interface {v7, v8, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_4
    invoke-interface {v3, v6}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3, v6, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v6, "sec_min_drop_km"

    invoke-interface {v1, v6, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_5
    invoke-interface {v3, v5}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-interface {v3, v5, v0}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v5, "sec_max_drop_km"

    invoke-interface {v1, v5, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_6
    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual/range {p2 .. p2}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v13, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_7
    const-string v0, "location_filters"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_8

    goto :goto_1

    :cond_8
    invoke-virtual {v2, v0}, Lz4/b;->b(Ljava/lang/String;)V

    :cond_9
    :goto_1
    const-string v0, "per_app_settings"

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_a

    goto :goto_3

    :cond_a
    new-instance v1, Lz4/c;

    invoke-direct {v1}, Lu7/a;-><init>()V

    iget-object v1, v1, Lu7/a;->b:Ljava/lang/reflect/Type;

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lp7/n;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_b

    sget-object v0, Lr8/s;->a:Lr8/s;

    :cond_b
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "app_enabled_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_2

    :cond_c
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :cond_d
    :goto_3
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v10, v15}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_5

    :goto_4
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v10, v15}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    throw v0

    :goto_5
    move-object/from16 v1, p0

    :goto_6
    iget-object v0, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const-string v2, "min_fare"

    const-string v3, "50"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_e

    goto :goto_7

    :cond_e
    move-object v3, v0

    :goto_7
    invoke-static {v3}, Ll9/h;->D0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_8

    :cond_f
    const/16 v0, 0x32

    :goto_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->e:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->f:Lp9/z;

    iget-object v0, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const-string v2, "max_fare"

    const-string v3, "500"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    goto :goto_9

    :cond_10
    move-object v3, v0

    :goto_9
    invoke-static {v3}, Ll9/h;->D0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_a

    :cond_11
    const/16 v0, 0x1f4

    :goto_a
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->n:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->o:Lp9/z;

    const-string v0, "service_enabled"

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->p:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->q:Lp9/z;

    const-string v0, "accepted_count"

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->r:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->s:Lp9/z;

    const-string v0, "skipped_count"

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->t:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->u:Lp9/z;

    const-string v0, "last_detected_fare"

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->v:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->w:Lp9/z;

    const-string v0, "today_earnings"

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->x:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->y:Lp9/z;

    const-string v0, "super_fast_mode"

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->z:Lp9/q0;

    const-string v0, "advanced_mode"

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->A:Lp9/q0;

    iget-object v0, v1, Lz4/d;->b:Lz4/b;

    invoke-virtual {v0}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, v14, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->B:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->C:Lp9/z;

    iget-object v0, v1, Lz4/d;->b:Lz4/b;

    invoke-virtual {v0}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v13, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->D:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->E:Lp9/z;

    invoke-virtual/range {p0 .. p0}, Lz4/d;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->F:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->G:Lp9/z;

    const-string v0, "ride_alert_enabled"

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->H:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->I:Lp9/z;

    invoke-virtual/range {p0 .. p0}, Lz4/d;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->J:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->K:Lp9/z;

    iget-object v0, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    const-string v0, "app_language"

    iput-object v0, v1, Lz4/d;->L:Ljava/lang/String;

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    const-string v3, "en"

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_12

    goto :goto_b

    :cond_12
    move-object v3, v0

    :goto_b
    invoke-static {v3}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, v1, Lz4/d;->M:Lp9/q0;

    new-instance v2, Lp9/z;

    invoke-direct {v2, v0}, Lp9/z;-><init>(Lp9/q0;)V

    iput-object v2, v1, Lz4/d;->N:Lp9/z;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lz4/d;->b:Lz4/b;

    invoke-virtual {v0}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "sec_location_filters"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lr8/r;->a:Lr8/r;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    new-instance v2, Lz4/c;

    invoke-direct {v2}, Lu7/a;-><init>()V

    iget-object v2, v2, Lu7/a;->b:Ljava/lang/reflect/Type;

    iget-object v3, p0, Lz4/d;->d:Lp7/n;

    invoke-virtual {v3, v0, v2}, Lp7/n;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :catch_0
    :goto_0
    return-object v1
.end method

.method public final b0orig()Ljava/util/LinkedHashMap;
    .locals 6

    sget-object v0, Lcom/auto/accept/data/model/SupportedApp;->Companion:Lcom/auto/accept/data/model/SupportedApp$Companion;

    invoke-virtual {v0}, Lcom/auto/accept/data/model/SupportedApp$Companion;->getALL_APPS()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v1

    invoke-static {v1}, Lz6/a;->T(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/auto/accept/data/model/SupportedApp;

    invoke-virtual {v1}, Lcom/auto/accept/data/model/SupportedApp;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/auto/accept/data/model/SupportedApp;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "appName"

    invoke-static {v1, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "app_enabled_"

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    iget-object v5, p0, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v5, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 3

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    const-string v0, "app_enabled_"

    invoke-static {p2, v0, p1}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lz4/d;->b()Ljava/util/LinkedHashMap;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->J:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "min_fare"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lz4/d;->c:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_3

    const-string p1, "50"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, p2

    :goto_0
    invoke-static {p1}, Ll9/h;->D0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_2
    const/16 p1, 0x32

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->e:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    const-string v0, "max_fare"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string p1, "500"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p2

    :goto_2
    invoke-static {p1}, Ll9/h;->D0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_5
    const/16 p1, 0x1f4

    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->n:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_6
    const-string v0, "service_enabled"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->p:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_7
    const-string v0, "accepted_count"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->r:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_8
    const-string v0, "skipped_count"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->t:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_9
    const-string v0, "last_detected_fare"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->v:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_a
    const-string v0, "today_earnings"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->x:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    const-string v0, "super_fast_mode"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->z:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto :goto_5

    :cond_c
    const-string v0, "advanced_mode"

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->A:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto :goto_5

    :cond_d
    const-string p1, "ride_alert_enabled"

    invoke-static {p2, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 p2, 0x1

    invoke-interface {v2, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, p0, Lz4/d;->H:Lp9/q0;

    invoke-virtual {p2, p1}, Lp9/q0;->i(Ljava/lang/Object;)V

    goto :goto_5

    :cond_e
    iget-object p1, p0, Lz4/d;->L:Ljava/lang/String;

    invoke-static {p2, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_10

    const-string p2, "en"

    invoke-interface {v2, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_f

    goto :goto_4

    :cond_f
    move-object p2, p1

    :goto_4
    iget-object p1, p0, Lz4/d;->M:Lp9/q0;

    invoke-virtual {p1, p2}, Lp9/q0;->i(Ljava/lang/Object;)V

    :cond_10
    :goto_5
    return-void
.end method

.method public final b()Ljava/util/LinkedHashMap;
    .locals 5

    invoke-virtual {p0}, Lz4/d;->b0orig()Ljava/util/LinkedHashMap;

    move-result-object v0

    if-nez v0, :have_map

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :have_map
    const-string v1, "sec_plan_expiry_ms"

    const-wide v2, 0x7fffffffffffffffL

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method