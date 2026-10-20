.class public final synthetic Lcom/google/firebase/firestore/local/i0;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:[Z

.field public final synthetic b:Landroid/database/sqlite/SQLiteStatement;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>([ZLandroid/database/sqlite/SQLiteStatement;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/local/i0;->a:[Z

    iput-object p2, p0, Lcom/google/firebase/firestore/local/i0;->b:Landroid/database/sqlite/SQLiteStatement;

    iput-wide p3, p0, Lcom/google/firebase/firestore/local/i0;->c:J

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lcom/google/firebase/firestore/local/i0;->c:J

    check-cast p1, Landroid/database/Cursor;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/i0;->a:[Z

    iget-object v3, p0, Lcom/google/firebase/firestore/local/i0;->b:Landroid/database/sqlite/SQLiteStatement;

    invoke-static {v2, v3, v0, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->o([ZLandroid/database/sqlite/SQLiteStatement;JLandroid/database/Cursor;)V

    return-void
.end method
