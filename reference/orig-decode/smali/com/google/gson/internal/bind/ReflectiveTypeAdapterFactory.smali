.class public final Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
.super Ljava/lang/Object;

# interfaces
.implements Lp7/b0;


# instance fields
.field public final a:Lr7/h;

.field public final b:Lp7/i;

.field public final c:Lcom/google/gson/internal/Excluder;

.field public final d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

.field public final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Lr7/h;Lcom/google/gson/internal/Excluder;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;Ljava/util/List;)V
    .locals 1

    sget-object v0, Lp7/h;->a:Lp7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->a:Lr7/h;

    iput-object v0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b:Lp7/i;

    iput-object p2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c:Lcom/google/gson/internal/Excluder;

    iput-object p3, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    iput-object p4, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->e:Ljava/util/List;

    return-void
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    sget-object v0, Lr7/t;->a:Lr7/t;

    invoke-virtual {v0, p0, p1}, Lr7/t;->a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    const/4 p0, 0x1

    invoke-static {p1, p0}, Lt7/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lp7/q;

    const-string v0, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."

    invoke-static {p0, v0}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lp7/n;Lu7/a;)Lp7/a0;
    .locals 4

    iget-object v0, p2, Lu7/a;->a:Ljava/lang/Class;

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->e:Ljava/util/List;

    invoke-static {v1}, Lz6/a;->F(Ljava/util/List;)V

    sget-object v1, Lt7/c;->a:Lo7/d0;

    invoke-virtual {v1, v0}, Lo7/d0;->Q(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/gson/internal/bind/k;

    const/4 v2, 0x1

    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c(Lp7/n;Lu7/a;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/google/gson/internal/bind/k;-><init>(Ljava/lang/Class;Ljava/util/LinkedHashMap;)V

    return-object v1

    :cond_1
    iget-object v1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->a:Lr7/h;

    invoke-virtual {v1, p2}, Lr7/h;->b(Lu7/a;)Lr7/q;

    move-result-object v1

    new-instance v2, Lcom/google/gson/internal/bind/j;

    const/4 v3, 0x0

    invoke-virtual {p0, p1, p2, v0, v3}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c(Lp7/n;Lu7/a;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Lcom/google/gson/internal/bind/j;-><init>(Lr7/q;Ljava/util/LinkedHashMap;)V

    return-object v2
.end method

.method public final c(Lp7/n;Lu7/a;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v15

    :cond_0
    move-object/from16 v13, p2

    move-object/from16 v12, p3

    :goto_0
    const-class v1, Ljava/lang/Object;

    if-eq v12, v1, :cond_14

    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v11

    move-object/from16 v10, p3

    if-eq v12, v10, :cond_1

    array-length v1, v11

    if-lez v1, :cond_1

    iget-object v1, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->e:Ljava/util/List;

    invoke-static {v1}, Lz6/a;->F(Ljava/util/List;)V

    :cond_1
    const/16 v16, 0x0

    array-length v9, v11

    const/4 v8, 0x0

    move v7, v8

    :goto_1
    if-ge v7, v9, :cond_13

    aget-object v6, v11, v7

    const/4 v5, 0x1

    invoke-virtual {v0, v6, v5}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->d(Ljava/lang/reflect/Field;Z)Z

    move-result v1

    invoke-virtual {v0, v6, v8}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->d(Ljava/lang/reflect/Field;Z)Z

    move-result v2

    if-nez v1, :cond_2

    if-nez v2, :cond_2

    move/from16 v33, v7

    move/from16 v34, v8

    move/from16 v27, v9

    move-object/from16 v28, v11

    move-object/from16 p2, v12

    move-object v14, v13

    move-object v1, v15

    goto/16 :goto_e

    :cond_2
    const-class v3, Lq7/b;

    const/16 v17, 0x0

    if-eqz p4, :cond_6

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move/from16 v18, v8

    :goto_2
    move-object/from16 v19, v17

    goto :goto_4

    :cond_3
    sget-object v4, Lt7/c;->a:Lo7/d0;

    invoke-virtual {v4, v12, v6}, Lo7/d0;->x(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-static {v4}, Lt7/c;->e(Ljava/lang/reflect/AccessibleObject;)V

    invoke-virtual {v4, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v18

    if-eqz v18, :cond_5

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v18

    if-eqz v18, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v4, v8}, Lt7/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lp7/q;

    const-string v3, "@SerializedName on "

    const-string v4, " is not supported"

    invoke-static {v3, v1, v4}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_3
    move/from16 v18, v2

    move-object/from16 v19, v4

    goto :goto_4

    :cond_6
    move/from16 v18, v2

    goto :goto_2

    :goto_4
    if-nez v19, :cond_7

    invoke-static {v6}, Lt7/c;->e(Ljava/lang/reflect/AccessibleObject;)V

    :cond_7
    iget-object v2, v13, Lu7/a;->b:Ljava/lang/reflect/Type;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v4

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-static {v2, v12, v4, v8}, Lr7/d;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lq7/b;

    if-nez v2, :cond_8

    iget-object v2, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b:Lp7/i;

    invoke-interface {v2, v6}, Lp7/i;->a(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_5
    move/from16 v20, v1

    move-object v4, v2

    goto :goto_6

    :cond_8
    invoke-interface {v2}, Lq7/b;->value()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Lq7/b;->alternate()[Ljava/lang/String;

    move-result-object v2

    array-length v4, v2

    if-nez v4, :cond_9

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_5

    :cond_9
    new-instance v4, Ljava/util/ArrayList;

    move/from16 v20, v1

    array-length v1, v2

    add-int/2addr v1, v5

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v4, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :goto_6
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v21, v17

    move/from16 v1, v20

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v3, :cond_11

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v22, v15

    move-object/from16 v15, v20

    check-cast v15, Ljava/lang/String;

    if-eqz v2, :cond_a

    const/16 v20, 0x0

    goto :goto_8

    :cond_a
    move/from16 v20, v1

    :goto_8
    new-instance v1, Lu7/a;

    invoke-direct {v1, v8}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    iget-object v5, v1, Lu7/a;->a:Ljava/lang/Class;

    move/from16 v24, v2

    instance-of v2, v5, Ljava/lang/Class;

    if-eqz v2, :cond_b

    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-eqz v2, :cond_b

    const/16 v25, 0x1

    goto :goto_9

    :cond_b
    const/16 v25, 0x0

    :goto_9
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v2

    if-eqz v2, :cond_c

    const/16 v26, 0x1

    goto :goto_a

    :cond_c
    const/16 v26, 0x0

    :goto_a
    const-class v2, Lq7/a;

    invoke-virtual {v6, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lq7/a;

    if-eqz v2, :cond_d

    iget-object v5, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->a:Lr7/h;

    invoke-static {v5, v14, v1, v2}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->b(Lr7/h;Lp7/n;Lu7/a;Lq7/a;)Lp7/a0;

    move-result-object v2

    goto :goto_b

    :cond_d
    move-object/from16 v2, v17

    :goto_b
    if-eqz v2, :cond_e

    const/16 v27, 0x1

    goto :goto_c

    :cond_e
    const/16 v27, 0x0

    :goto_c
    if-nez v2, :cond_f

    invoke-virtual {v14, v1}, Lp7/n;->c(Lu7/a;)Lp7/a0;

    move-result-object v2

    :cond_f
    move-object/from16 v28, v2

    new-instance v5, Lcom/google/gson/internal/bind/h;

    move-object/from16 v29, v1

    move-object v1, v5

    move-object v2, v15

    move/from16 v30, v3

    move-object v3, v6

    move-object/from16 v31, v4

    move/from16 v4, v20

    move-object v0, v5

    const/16 v23, 0x1

    move/from16 v5, v18

    move-object/from16 v32, v6

    move/from16 v6, v16

    move/from16 v33, v7

    move-object/from16 v7, v19

    move-object/from16 v35, v8

    const/16 v34, 0x0

    move/from16 v8, v27

    move/from16 v27, v9

    move-object/from16 v9, v28

    move-object/from16 v10, p1

    move-object/from16 v28, v11

    move-object/from16 v11, v29

    move-object/from16 p2, v12

    move/from16 v12, v25

    move-object v14, v13

    move/from16 v13, v26

    invoke-direct/range {v1 .. v13}, Lcom/google/gson/internal/bind/h;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZZZLjava/lang/reflect/Method;ZLp7/a0;Lp7/n;Lu7/a;ZZ)V

    move-object/from16 v1, v22

    invoke-interface {v1, v15, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/internal/bind/h;

    move-object/from16 v2, v21

    if-nez v2, :cond_10

    move-object/from16 v21, v0

    goto :goto_d

    :cond_10
    move-object/from16 v21, v2

    :goto_d
    add-int/lit8 v2, v24, 0x1

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move-object/from16 v10, p3

    move-object v15, v1

    move-object v13, v14

    move/from16 v1, v20

    move/from16 v5, v23

    move/from16 v9, v27

    move-object/from16 v11, v28

    move/from16 v3, v30

    move-object/from16 v4, v31

    move-object/from16 v6, v32

    move/from16 v7, v33

    move-object/from16 v8, v35

    move-object/from16 v14, p1

    goto/16 :goto_7

    :cond_11
    move-object/from16 v32, v6

    move/from16 v33, v7

    move/from16 v27, v9

    move-object/from16 v28, v11

    move-object/from16 p2, v12

    move-object v14, v13

    move-object v1, v15

    move-object/from16 v2, v21

    const/16 v34, 0x0

    if-nez v2, :cond_12

    :goto_e
    add-int/lit8 v7, v33, 0x1

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move-object/from16 v10, p3

    move-object v15, v1

    move-object v13, v14

    move/from16 v9, v27

    move-object/from16 v11, v28

    move/from16 v8, v34

    move-object/from16 v14, p1

    goto/16 :goto_1

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Class "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " declares multiple JSON fields named \'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v2, Lcom/google/gson/internal/bind/h;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'; conflict is caused by fields "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lcom/google/gson/internal/bind/h;->b:Ljava/lang/reflect/Field;

    invoke-static {v2}, Lt7/c;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v32 .. v32}, Lt7/c;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    move-object/from16 p2, v12

    move-object v14, v13

    move-object v1, v15

    iget-object v0, v14, Lu7/a;->b:Ljava/lang/reflect/Type;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    move-object/from16 v4, p2

    invoke-static {v0, v4, v2, v3}, Lr7/d;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v0

    new-instance v13, Lu7/a;

    invoke-direct {v13, v0}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    iget-object v12, v13, Lu7/a;->a:Ljava/lang/Class;

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move-object v15, v1

    goto/16 :goto_0

    :cond_14
    move-object v1, v15

    return-object v1
.end method

.method public final d(Ljava/lang/reflect/Field;Z)Z
    .locals 7

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c:Lcom/google/gson/internal/Excluder;

    invoke-virtual {v1, v0}, Lcom/google/gson/internal/Excluder;->b(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v1, p2}, Lcom/google/gson/internal/Excluder;->c(Z)V

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    iget v2, v1, Lcom/google/gson/internal/Excluder;->b:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-wide v2, v1, Lcom/google/gson/internal/Excluder;->a:D

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpl-double v0, v2, v4

    if-eqz v0, :cond_2

    const-class v0, Lq7/c;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lq7/c;

    const-class v2, Lq7/d;

    invoke-virtual {p1, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lq7/d;

    iget-wide v3, v1, Lcom/google/gson/internal/Excluder;->a:D

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lq7/c;->value()D

    move-result-wide v5

    cmpl-double v0, v3, v5

    if-ltz v0, :cond_9

    :cond_1
    if-eqz v2, :cond_2

    invoke-interface {v2}, Lq7/d;->value()D

    move-result-wide v5

    cmpg-double v0, v3, v5

    if-gez v0, :cond_9

    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    iget-boolean v0, v1, Lcom/google/gson/internal/Excluder;->c:Z

    if-nez v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_9

    :cond_4
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lcom/google/gson/internal/Excluder;->d(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    if-eqz p2, :cond_6

    iget-object p1, v1, Lcom/google/gson/internal/Excluder;->d:Ljava/util/List;

    goto :goto_0

    :cond_6
    iget-object p1, v1, Lcom/google/gson/internal/Excluder;->e:Ljava/util/List;

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_8

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_8
    :goto_1
    const/4 p1, 0x1

    goto :goto_3

    :cond_9
    :goto_2
    const/4 p1, 0x0

    :goto_3
    return p1
.end method
