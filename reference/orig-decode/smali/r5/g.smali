.class public final synthetic Lr5/g;
.super Ljava/lang/Object;

# interfaces
.implements Lr5/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr5/m;

.field public final synthetic c:Ll5/j;


# direct methods
.method public synthetic constructor <init>(Lr5/m;Ll5/j;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lr5/g;->a:I

    iput-object p1, p0, Lr5/g;->b:Lr5/m;

    iput-object p2, p0, Lr5/g;->c:Ll5/j;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lr5/g;->a:I

    iget-object v1, p0, Lr5/g;->c:Ll5/j;

    iget-object v2, p0, Lr5/g;->b:Lr5/m;

    packed-switch v0, :pswitch_data_0

    move-object v3, p1

    check-cast v3, Landroid/database/sqlite/SQLiteDatabase;

    iget-object p1, v2, Lr5/m;->d:Lr5/a;

    iget v0, p1, Lr5/a;->b:I

    invoke-virtual {v2, v3, v1, v0}, Lr5/m;->f(Landroid/database/sqlite/SQLiteDatabase;Ll5/j;I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {}, Li5/d;->values()[Li5/d;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_2

    aget-object v8, v4, v7

    iget-object v9, v1, Ll5/j;->c:Li5/d;

    if-ne v8, v9, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v9

    iget v10, p1, Lr5/a;->b:I

    sub-int/2addr v10, v9

    if-gtz v10, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {}, Ll5/j;->a()Ll/z2;

    move-result-object v9

    iget-object v11, v1, Ll5/j;->a:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ll/z2;->L(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ll/z2;->N(Li5/d;)V

    iget-object v8, v1, Ll5/j;->b:[B

    iput-object v8, v9, Ll/z2;->c:Ljava/lang/Object;

    invoke-virtual {v9}, Ll/z2;->j()Ll5/j;

    move-result-object v8

    invoke-virtual {v2, v3, v8, v10}, Lr5/m;->f(Landroid/database/sqlite/SQLiteDatabase;Ll5/j;I)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "event_id IN ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v6, v2, :cond_4

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr5/b;

    iget-wide v4, v2, Lr5/b;->a:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v6, v2, :cond_3

    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, "event_metadata"

    const-string v2, "event_id"

    const-string v5, "name"

    const-string v6, "value"

    filled-new-array {v2, v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    new-instance v2, Lb/b;

    const/16 v3, 0xa

    invoke-direct {v2, p1, v3}, Lb/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Lr5/m;->q(Landroid/database/Cursor;Lr5/k;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr5/b;

    iget-wide v3, v2, Lr5/b;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    iget-object v3, v2, Lr5/b;->c:Ll5/i;

    invoke-virtual {v3}, Ll5/i;->c()Ll/r;

    move-result-object v3

    iget-wide v4, v2, Lr5/b;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr5/l;

    iget-object v8, v7, Lr5/l;->a:Ljava/lang/String;

    iget-object v7, v7, Lr5/l;->b:Ljava/lang/String;

    invoke-virtual {v3, v8, v7}, Ll/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Ll/r;->c()Ll5/i;

    move-result-object v3

    new-instance v6, Lr5/b;

    iget-object v2, v2, Lr5/b;->b:Ll5/j;

    invoke-direct {v6, v4, v5, v2, v3}, Lr5/b;-><init>(JLl5/j;Ll5/i;)V

    invoke-interface {v1, v6}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    return-object v0

    :pswitch_0
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, Lr5/m;->b(Landroid/database/sqlite/SQLiteDatabase;Ll5/j;)Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_8

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_6

    :cond_8
    invoke-virtual {v2}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const-string v1, "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"

    invoke-virtual {v0, v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    new-instance v0, Lb0/l0;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lb0/l0;-><init>(I)V

    invoke-static {p1, v0}, Lr5/m;->q(Landroid/database/Cursor;Lr5/k;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    :goto_6
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
